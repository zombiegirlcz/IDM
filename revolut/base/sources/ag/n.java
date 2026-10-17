package ag;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkerWrapper;
import com.appsflyer.internal.AFi1cSDK;
import com.appsflyer.internal.AFi1lSDK;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.R$id;
import com.revolut.retail.core.navigation.ActivityDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.BaseFragmentNavigateCommand;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.ChooserActivityDestination;
import com.revolut.retail.core.navigation.CollapseApplicationCommand;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.DeeplinkNavigateCommand;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.ExternalAppDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FileOpenActivityDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import com.revolut.retail.core.navigation.FinishFragmentNavigateCommand;
import com.revolut.retail.core.navigation.FragmentDestination;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import com.revolut.retail.core.navigation.IntentCommand;
import com.revolut.retail.core.navigation.IntentSenderCommand;
import com.revolut.retail.core.navigation.ModalFragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.RestartApplicationCommand;
import com.revolut.retail.core.navigation.SelectorActivityDestination;
import com.revolut.retail.core.navigation.SettingsDestination;
import com.revolut.retail.core.navigation.feature.ByIdFeatureConfig;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.core.navigation.feature.SingleActivityFeatureConfig;
import com.revolut.retail.core.navigation.feature.SingleActivityReadyFeatureConfig;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.core.ui.activity.CustomTheme;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xf.i0;
import xf.t0;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4712c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n(Object obj2, int i, Object obj3, Object obj4) {
        this.f4710a = i;
        this.f4711b = obj2;
        this.f4712c = obj3;
        this.d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment fragmentPrevious;
        CustomTheme customTheme;
        int i = this.f4710a;
        Object obj2 = this.d;
        Object obj3 = this.f4712c;
        Object obj4 = this.f4711b;
        switch (i) {
            case 0:
                ((BiConsumer) obj4).accept((String) obj3, (g) obj2);
                return;
            case 1:
                ((AFi1cSDK) obj4).values((AFi1lSDK) obj3, (Runnable) obj2);
                return;
            case 2:
                com.google.firebase.messaging.i iVar = (com.google.firebase.messaging.i) obj4;
                Intent intent = (Intent) obj3;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                iVar.getClass();
                try {
                    iVar.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 3:
                String str = (String) obj3;
                String str2 = (String) obj2;
                ie.n nVar = ((ie.r) obj4).f160558g;
                nVar.getClass();
                try {
                    ((ch.m) nVar.d.d).d(str, str2);
                    return;
                } catch (IllegalArgumentException e) {
                    Context context = nVar.f160537a;
                    if (context != null && (2 & context.getApplicationInfo().flags) != 0) {
                        throw e;
                    }
                    return;
                }
            case 4:
                ((Processor) obj4).lambda$startWork$1((ListenableFuture) obj3, (WorkerWrapper) obj2);
                return;
            case 5:
                com.revolut.retail.core.navigation.b bVar = (com.revolut.retail.core.navigation.b) obj4;
                sri.c cVar = bVar.f98672b;
                NaviCommand naviCommand = (NaviCommand) obj3;
                nri.b activity = (nri.b) obj2;
                LinkedHashSet linkedHashSet = bVar.k;
                jpf.a aVar = bVar.i;
                Iterator it8 = linkedHashSet.iterator();
                while (it8.hasNext()) {
                    ((sri.l) it8.next()).c(naviCommand);
                }
                List listB = com.revolut.retail.core.navigation.a.b(naviCommand);
                FinishFlowCommand finishFlowCommand = FinishFlowCommand.f98647a;
                if (listB.contains(finishFlowCommand)) {
                    return;
                }
                if (naviCommand instanceof DeeplinkNavigateCommand) {
                    DeeplinkNavigateCommand deeplinkNavigateCommand = (DeeplinkNavigateCommand) naviCommand;
                    Intent intent2 = new Intent(activity, (Class<?>) deeplinkNavigateCommand.f98630a.f98636a);
                    intent2.setAction(deeplinkNavigateCommand.d);
                    Iterator it9 = deeplinkNavigateCommand.e.iterator();
                    while (it9.hasNext()) {
                        intent2.addCategory((String) it9.next());
                    }
                    intent2.setData(deeplinkNavigateCommand.f);
                    nim.a.F(intent2, deeplinkNavigateCommand.f98632c);
                    Intent intentP = com.revolut.retail.core.navigation.b.p(intent2, deeplinkNavigateCommand.f98631b);
                    int i2 = deeplinkNavigateCommand.f98633g;
                    Intrinsics.checkNotNullParameter(intentP, "<this>");
                    intentP.setFlags(i2);
                    activity.startActivity(intentP);
                    return;
                }
                if (naviCommand instanceof ActivityNavigateCommand) {
                    ActivityNavigateCommand activityNavigateCommand = (ActivityNavigateCommand) naviCommand;
                    Integer num = activityNavigateCommand.d;
                    int i3 = activityNavigateCommand.e;
                    ActivityDestination activityDestination = activityNavigateCommand.f98618a;
                    if (activityDestination instanceof ExplicitActivityDestination) {
                        Intent intent3 = new Intent(activity, (Class<?>) ((ExplicitActivityDestination) activityDestination).f98636a);
                        if ((activity instanceof BaseDelegatesActivity) && (customTheme = ((BaseDelegatesActivity) activity).f98685d0) != null) {
                            intent3.putExtra("theme_arg", customTheme);
                        }
                        bVar.j(activityNavigateCommand, activity, intent3);
                        return;
                    }
                    if (activityDestination instanceof ImplicitActivityDestination) {
                        ImplicitActivityDestination implicitActivityDestination = (ImplicitActivityDestination) activityDestination;
                        Intent intentL = com.revolut.retail.core.navigation.b.l(implicitActivityDestination);
                        String f98659c = implicitActivityDestination.getF98659c();
                        Intrinsics.checkNotNullParameter(intentL, "<this>");
                        if (f98659c != null) {
                            intentL.setPackage(f98659c);
                        }
                        activity.z0();
                        bVar.j(activityNavigateCommand, activity, intentL);
                        return;
                    }
                    if (activityDestination instanceof ChooserActivityDestination) {
                        com.revolut.retail.core.navigation.b.m(activity, activityNavigateCommand, (ChooserActivityDestination) activityDestination);
                        return;
                    }
                    if (activityDestination instanceof SelectorActivityDestination) {
                        SelectorActivityDestination selectorActivityDestination = (SelectorActivityDestination) activityDestination;
                        try {
                            Intent intentMakeMainSelectorActivity = Intent.makeMainSelectorActivity(selectorActivityDestination.getF98668a(), selectorActivityDestination.getF98669b());
                            Intrinsics.checkNotNullExpressionValue(intentMakeMainSelectorActivity, "makeMainSelectorActivity(...)");
                            Intrinsics.checkNotNullParameter(intentMakeMainSelectorActivity, "<this>");
                            intentMakeMainSelectorActivity.setFlags(i3);
                            activity.z0();
                            if (num != null) {
                                int iIntValue = num.intValue();
                                if (cVar instanceof sri.a) {
                                    ((sri.a) cVar).f265230a.startActivityForResult(intentMakeMainSelectorActivity, iIntValue, null);
                                } else {
                                    activity.startActivityForResult(intentMakeMainSelectorActivity, iIntValue, null);
                                }
                            } else {
                                activity.startActivity(intentMakeMainSelectorActivity);
                            }
                            return;
                        } catch (ActivityNotFoundException e2) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
                            return;
                        }
                    }
                    if (activityDestination instanceof FileOpenActivityDestination) {
                        com.revolut.retail.core.navigation.b.o(activity, (FileOpenActivityDestination) activityDestination);
                        return;
                    }
                    if (activityDestination instanceof SettingsDestination) {
                        String f98670a = ((SettingsDestination) activityDestination).getF98670a();
                        Context context2 = (Context) bVar.f98676j.get();
                        Uri uriFromParts = Uri.fromParts("package", context2 != null ? context2.getPackageName() : null, null);
                        Intrinsics.checkNotNullExpressionValue(uriFromParts, "fromParts(...)");
                        ImplicitActivityDestination implicitActivityDestination2 = new ImplicitActivityDestination(f98670a, null, null, null, uriFromParts, 14);
                        Intent intentL2 = com.revolut.retail.core.navigation.b.l(implicitActivityDestination2);
                        String f98659c2 = implicitActivityDestination2.getF98659c();
                        Intrinsics.checkNotNullParameter(intentL2, "<this>");
                        if (f98659c2 != null) {
                            intentL2.setPackage(f98659c2);
                        }
                        activity.z0();
                        bVar.j(activityNavigateCommand, activity, intentL2);
                        return;
                    }
                    if (!(activityDestination instanceof ExternalAppDestination)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Intrinsics.i(activity, "null cannot be cast to non-null type android.content.Context");
                    Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(((ExternalAppDestination) activityDestination).getF98637a());
                    if (launchIntentForPackage != null) {
                        Intrinsics.checkNotNullParameter(launchIntentForPackage, "<this>");
                        launchIntentForPackage.setFlags(i3);
                        Intent intentP2 = com.revolut.retail.core.navigation.b.p(launchIntentForPackage, activityNavigateCommand.f98619b);
                        nim.a.F(intentP2, activityNavigateCommand.f98620c);
                        nim.a.G(intentP2, activityNavigateCommand.f);
                        if (num == null) {
                            activity.startActivity(launchIntentForPackage);
                            return;
                        }
                        int iIntValue2 = num.intValue();
                        if (cVar instanceof sri.a) {
                            ((sri.a) cVar).f265230a.startActivityForResult(launchIntentForPackage, iIntValue2, null);
                            return;
                        } else {
                            activity.startActivityForResult(launchIntentForPackage, iIntValue2, null);
                            return;
                        }
                    }
                    return;
                }
                if (naviCommand instanceof RestartApplicationCommand) {
                    Intent launchIntentForPackage2 = activity.getApplicationContext().getPackageManager().getLaunchIntentForPackage(activity.getApplicationContext().getPackageName());
                    if (launchIntentForPackage2 != null) {
                        launchIntentForPackage2.addFlags(335577088);
                    }
                    activity.startActivity(launchIntentForPackage2);
                    System.exit(0);
                    throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                }
                if (naviCommand instanceof CollapseApplicationCommand) {
                    Intent intent4 = new Intent("android.intent.action.MAIN");
                    intent4.addCategory("android.intent.category.HOME");
                    intent4.addFlags(268435456);
                    activity.startActivity(intent4);
                    return;
                }
                boolean z = true;
                if (naviCommand instanceof BaseFragmentNavigateCommand) {
                    BaseFragmentNavigateCommand command = (BaseFragmentNavigateCommand) naviCommand;
                    sri.c cVar2 = (sri.c) aVar.f177268b;
                    sri.f fVar = (sri.f) aVar.f177269c;
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Intrinsics.checkNotNullParameter(command, "command");
                    if (!(command instanceof FragmentNavigateCommand)) {
                        if (!(command instanceof ModalFragmentNavigateCommand)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ModalFragmentNavigateCommand modalFragmentNavigateCommand = (ModalFragmentNavigateCommand) command;
                        if (((ViewGroup) jpf.a.o(activity).findViewById(R$id.modalContainerId)) != null) {
                            throw new IllegalStateException("Only one modal fragment container is allowed for activity");
                        }
                        int i5 = sri.d.f265231a[modalFragmentNavigateCommand.f98665b.ordinal()];
                        if (i5 == 1) {
                            z = true;
                        } else {
                            if (i5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            z = false;
                        }
                        xri.b bVar2 = new xri.b(activity, z, z);
                        bVar2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                        bVar2.setId(R$id.modalContainerId);
                        jpf.a.o(activity).addView(bVar2);
                        FragmentDestination fragmentDestination = modalFragmentNavigateCommand.f98664a;
                        FragmentManager fragmentManagerA = cVar2.a();
                        ClassLoader classLoader = activity.getClassLoader();
                        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
                        String name = fragmentDestination.f98650a.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        Fragment fragmentE = fVar.e(name, classLoader, null);
                        if (modalFragmentNavigateCommand.getF98666c() != null) {
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("CONFIGURATION_ARG", modalFragmentNavigateCommand.getF98666c());
                            fragmentE.setArguments(bundle);
                        }
                        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManagerA.beginTransaction();
                        fragmentTransactionBeginTransaction.replace(bVar2.getId(), fragmentE);
                        fragmentTransactionBeginTransaction.addToBackStack(fragmentDestination.f98650a.getName());
                        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                        fragmentE.getLifecycle().addObserver(new sri.e(aVar, activity, bVar2, fragmentE));
                        return;
                    }
                    Integer num2 = (Integer) aVar.f177267a;
                    if (num2 == null) {
                        throw new IllegalStateException("containerId is not provided to handle command=".concat(command.getClass().getSimpleName()).toString());
                    }
                    int iIntValue3 = num2.intValue();
                    FragmentNavigateCommand fragmentNavigateCommand = (FragmentNavigateCommand) command;
                    FragmentDestination fragmentDestination2 = fragmentNavigateCommand.f98651a;
                    boolean z3 = fragmentNavigateCommand.f;
                    boolean z4 = fragmentNavigateCommand.e;
                    FragmentManager fragmentManagerA2 = cVar2.a();
                    Fragment fragmentFindFragmentById = fragmentManagerA2.findFragmentById(iIntValue3);
                    if (fragmentFindFragmentById == null || !fragmentFindFragmentById.getClass().equals(fragmentDestination2.f98650a) || fragmentNavigateCommand.f98653c) {
                        ClassLoader classLoader2 = activity.getClassLoader();
                        Intrinsics.checkNotNullExpressionValue(classLoader2, "getClassLoader(...)");
                        String name2 = fragmentDestination2.f98650a.getName();
                        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                        Fragment fragmentE2 = fVar.e(name2, classLoader2, null);
                        if (fragmentNavigateCommand.getF98652b() != null) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("CONFIGURATION_ARG", fragmentNavigateCommand.getF98652b());
                            fragmentE2.setArguments(bundle2);
                        }
                        FragmentTransaction fragmentTransactionBeginTransaction2 = fragmentManagerA2.beginTransaction();
                        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction2, "beginTransaction(...)");
                        fragmentTransactionBeginTransaction2.setCustomAnimations(fragmentNavigateCommand.f98654g, fragmentNavigateCommand.f98655h, fragmentNavigateCommand.i, fragmentNavigateCommand.f98656j);
                        if (fragmentNavigateCommand.d) {
                            List<Fragment> fragments = fragmentManagerA2.getFragments();
                            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
                            Iterator<T> it10 = fragments.iterator();
                            while (it10.hasNext()) {
                                fragmentTransactionBeginTransaction2.remove((Fragment) it10.next());
                            }
                        }
                        if (z4 && fVar.b()) {
                            if (fragmentFindFragmentById != null) {
                                fragmentTransactionBeginTransaction2.detach(fragmentFindFragmentById);
                            }
                            if (fragmentE2.isDetached()) {
                                fragmentTransactionBeginTransaction2.attach(fragmentE2);
                            } else {
                                fragmentTransactionBeginTransaction2.add(iIntValue3, fragmentE2);
                            }
                        } else if (!z4 || fVar.b()) {
                            fragmentTransactionBeginTransaction2.add(iIntValue3, fragmentE2);
                        } else {
                            fragmentTransactionBeginTransaction2.replace(iIntValue3, fragmentE2);
                        }
                        if (z3) {
                            fragmentTransactionBeginTransaction2.addToBackStack(fragmentDestination2.f98650a.getName());
                        }
                        Intent intent5 = fragmentNavigateCommand.k;
                        if (intent5 != null) {
                            activity.setIntent(intent5);
                        }
                        if (z3) {
                            fragmentTransactionBeginTransaction2.commitAllowingStateLoss();
                            return;
                        } else {
                            fragmentTransactionBeginTransaction2.commitNowAllowingStateLoss();
                            return;
                        }
                    }
                    return;
                }
                if (naviCommand instanceof FinishCommand) {
                    FinishCommand finishCommand = (FinishCommand) naviCommand;
                    Integer num3 = finishCommand.f98642a;
                    if (num3 != null) {
                        int iIntValue4 = num3.intValue();
                        Intent intent6 = new Intent();
                        nim.a.F(intent6, finishCommand.f98643b);
                        activity.setResult(iIntValue4, intent6);
                    }
                    FinishCommand.Mode mode = finishCommand.f98644c;
                    if (Intrinsics.f(mode, FinishCommand.Mode.FinishAffinity.f98645a)) {
                        activity.finishAffinity();
                        return;
                    } else if (Intrinsics.f(mode, FinishCommand.Mode.FinishAfterTransition.f98646a)) {
                        activity.finishAfterTransition();
                        return;
                    } else {
                        if (mode != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        activity.finish();
                        return;
                    }
                }
                if (naviCommand instanceof FeatureCommand) {
                    FeatureCommand featureCommand = (FeatureCommand) naviCommand;
                    FeatureConfig featureConfig = featureCommand.f98638a;
                    if (!(featureConfig instanceof ByIdFeatureConfig)) {
                        if ((featureConfig instanceof SingleActivityReadyFeatureConfig) && ((KompotOverlayFeatureConfig) ((SingleActivityReadyFeatureConfig) featureConfig)).getD()) {
                            bVar.e.getClass();
                            if (wri.b.a()) {
                                SingleActivityFeatureConfig config = new SingleActivityFeatureConfig(featureConfig);
                                Intrinsics.checkNotNullParameter(config, "config");
                                featureCommand = new FeatureCommand(config);
                            }
                        }
                        bVar.k(featureCommand);
                        return;
                    }
                    ByIdFeatureConfig byIdFeatureConfig = (ByIdFeatureConfig) featureConfig;
                    LinkedHashMap linkedHashMap = bVar.f98671a;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (((uri.a) ((phm.a) entry.getValue()).get()).b(byIdFeatureConfig)) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    bVar.f(linkedHashMap2, byIdFeatureConfig, new sdi.k(bVar, byIdFeatureConfig, 21));
                    return;
                }
                if (naviCommand instanceof CompositeCommand) {
                    Iterator it11 = ((CompositeCommand) naviCommand).f98629a.iterator();
                    while (it11.hasNext()) {
                        bVar.g(activity, (NaviCommand) it11.next());
                    }
                    return;
                }
                if (!(naviCommand instanceof FinishFragmentNavigateCommand)) {
                    if (naviCommand instanceof BrowserCommand) {
                        Intent intent7 = new Intent("android.intent.action.VIEW", ((BrowserCommand) naviCommand).getF98624a());
                        if (activity == null) {
                            intent7.addFlags(268435456);
                        }
                        activity.startActivity(intent7);
                        return;
                    }
                    if (naviCommand instanceof IntentCommand) {
                        IntentCommand intentCommand = (IntentCommand) naviCommand;
                        Integer numB = intentCommand.getF98661b();
                        Intent intentA = intentCommand.getF98660a();
                        if (numB == null || activity == null) {
                            activity.startActivity(intentA);
                            return;
                        } else {
                            activity.startActivityForResult(intentA, numB.intValue());
                            return;
                        }
                    }
                    if ((naviCommand instanceof DummyCommand) || naviCommand.equals(finishFlowCommand)) {
                        return;
                    }
                    if (!(naviCommand instanceof IntentSenderCommand)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IntentSenderCommand intentSenderCommand = (IntentSenderCommand) naviCommand;
                    try {
                        ActivityCompat.startIntentSenderForResult(activity, intentSenderCommand.getF98662a(), intentSenderCommand.getF98663b(), null, 0, 0, 0, null);
                        return;
                    } catch (IntentSender.SendIntentException e4) {
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, e4, h0Var2);
                        return;
                    }
                }
                FinishFragmentNavigateCommand command2 = (FinishFragmentNavigateCommand) naviCommand;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(command2, "command");
                FragmentManager fragmentManagerA3 = ((sri.c) aVar.f177268b).a();
                for (Fragment fragment : fragmentManagerA3.getFragments()) {
                    if (fragment.isVisible()) {
                        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                        if (childFragmentManager.getBackStackEntryCount() > 0) {
                            childFragmentManager.popBackStack();
                            return;
                        }
                    }
                }
                z = jpf.a.o(activity).findViewById(R$id.modalContainerId) != null;
                if (fragmentManagerA3.getBackStackEntryCount() > 0) {
                    fragmentManagerA3.popBackStack();
                } else if (activity.getSupportFragmentManager().getBackStackEntryCount() > 0) {
                    activity.getSupportFragmentManager().popBackStack();
                } else if (command2.f98649b) {
                    List<Fragment> fragments2 = fragmentManagerA3.getFragments();
                    Intrinsics.checkNotNullExpressionValue(fragments2, "getFragments(...)");
                    ListIterator<Fragment> listIterator = fragments2.listIterator(fragments2.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            fragmentPrevious = listIterator.previous();
                            if (fragmentPrevious.isVisible()) {
                            }
                        } else {
                            fragmentPrevious = null;
                        }
                    }
                    Fragment fragment2 = fragmentPrevious;
                    if (fragment2 != null) {
                        FragmentTransaction fragmentTransactionBeginTransaction3 = fragmentManagerA3.beginTransaction();
                        fragmentTransactionBeginTransaction3.remove(fragment2);
                        fragmentTransactionBeginTransaction3.commitNowAllowingStateLoss();
                    }
                }
                if (command2.f98648a && !z && fragmentManagerA3.getBackStackEntryCount() == 0) {
                    activity.finish();
                    return;
                }
                return;
            case 6:
                ((SessionManager) obj4).lambda$setApplicationContext$0((Context) obj3, (PerfSession) obj2);
                return;
            case 7:
                ((GaugeManager) obj4).lambda$stopCollectingGauges$3((String) obj3, (xf.n) obj2);
                return;
            case 8:
                wf.e eVar = (wf.e) obj4;
                eVar.getClass();
                xf.h0 h0VarNewBuilder = i0.newBuilder();
                h0VarNewBuilder.c();
                ((i0) h0VarNewBuilder.f49761b).setTraceMetric((t0) obj3);
                eVar.d(h0VarNewBuilder, (xf.n) obj2);
                return;
            default:
                ((VideoRendererEventListener.EventDispatcher) obj4).lambda$inputFormatChanged$2((Format) obj3, (DecoderReuseEvaluation) obj2);
                return;
        }
    }
}
