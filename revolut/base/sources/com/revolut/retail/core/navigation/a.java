package com.revolut.retail.core.navigation;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.ActivityAnimation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import sri.g;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {
    public static final ActivityNavigateCommand a(ActivityNavigateCommand activityNavigateCommand) {
        Intrinsics.checkNotNullParameter(activityNavigateCommand, "<this>");
        return ActivityNavigateCommand.a(activityNavigateCommand, null, 335577088, 1007);
    }

    public static final List b(NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(naviCommand, "<this>");
        if (!(naviCommand instanceof CompositeCommand)) {
            return u.c(naviCommand);
        }
        List list = ((CompositeCommand) naviCommand).f98629a;
        List listE0 = f0.f322471a;
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            listE0 = d0.E0(b((NaviCommand) it8.next()), listE0);
        }
        return listE0;
    }

    public static final CompositeCommand c(NaviCommand naviCommand, NaviCommand naviCommand2) {
        Intrinsics.checkNotNullParameter(naviCommand, "<this>");
        if (naviCommand instanceof CompositeCommand) {
            CompositeCommand compositeCommand = (CompositeCommand) naviCommand;
            List commands = compositeCommand.f98629a;
            Intrinsics.checkNotNullParameter(compositeCommand, "<this>");
            if (naviCommand2 != null) {
                commands = d0.F0(naviCommand2, commands);
            }
            Intrinsics.checkNotNullParameter(commands, "commands");
            return new CompositeCommand(commands);
        }
        if (!(naviCommand2 instanceof CompositeCommand)) {
            NaviCommand[] elements = {naviCommand, naviCommand2};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return new CompositeCommand(d.L(elements));
        }
        s0 s0Var = new s0(2);
        s0Var.a(naviCommand);
        s0Var.b(((CompositeCommand) naviCommand2).f98629a.toArray(new NaviCommand[0]));
        ArrayList arrayList = s0Var.f186433a;
        return new CompositeCommand(v.m(arrayList.toArray(new NaviCommand[arrayList.size()])));
    }

    public static final ActivityNavigateCommand d(ActivityNavigateCommand activityNavigateCommand) {
        Intrinsics.checkNotNullParameter(activityNavigateCommand, "<this>");
        return ActivityNavigateCommand.a(activityNavigateCommand, null, 603979776, 1007);
    }

    public static final String e(Set set) {
        List listO0;
        String strK0;
        return (set == null || (listO0 = d0.O0(set)) == null || (strK0 = d0.k0(listO0, null, "[", "]", 0, null, 57)) == null) ? "null" : strK0;
    }

    public static final String f(Intent intent) {
        String action = intent.getAction();
        Uri data = intent.getData();
        String type = intent.getType();
        String str = intent.getPackage();
        ComponentName component = intent.getComponent();
        String className = component != null ? component.getClassName() : null;
        int flags = intent.getFlags();
        Set<String> categories = intent.getCategories();
        int size = categories != null ? categories.size() : 0;
        Bundle extras = intent.getExtras();
        String strE = e(extras != null ? extras.keySet() : null);
        StringBuilder sb6 = new StringBuilder("Intent(action=");
        sb6.append(action);
        sb6.append(", data=");
        sb6.append(data);
        sb6.append(", type=");
        j6.a.D(sb6, type, ", package=", str, ", component=");
        sb6.append(className);
        sb6.append(", flags=");
        sb6.append(flags);
        sb6.append(", categoriesCount=");
        sb6.append(size);
        sb6.append(", extrasKeys=");
        sb6.append(strE);
        sb6.append(")");
        return sb6.toString();
    }

    public static final String g(NaviCommand naviCommand) {
        String str;
        String strP;
        Integer num;
        String str2;
        String str3;
        String strP2;
        Intrinsics.checkNotNullParameter(naviCommand, "<this>");
        if (naviCommand instanceof ActivityNavigateCommand) {
            ActivityNavigateCommand activityNavigateCommand = (ActivityNavigateCommand) naviCommand;
            ActivityDestination activityDestination = activityNavigateCommand.f98618a;
            if (activityDestination instanceof ExplicitActivityDestination) {
                strP = p.a.p("ExplicitActivityDestination(clazz=", ((ExplicitActivityDestination) activityDestination).f98636a.getName(), ")");
                str = ", enter=";
            } else if (activityDestination instanceof ImplicitActivityDestination) {
                ImplicitActivityDestination implicitActivityDestination = (ImplicitActivityDestination) activityDestination;
                String f98657a = implicitActivityDestination.getF98657a();
                int size = implicitActivityDestination.getF98658b().size();
                Uri e = implicitActivityDestination.getE();
                String f98659c = implicitActivityDestination.getF98659c();
                String d = implicitActivityDestination.getD();
                str = ", enter=";
                StringBuilder sbK = v0.a.k(size, "ImplicitActivityDestination(action=", f98657a, ", categoriesCount=", ", uri=");
                sbK.append(e);
                sbK.append(", packageName=");
                sbK.append(f98659c);
                sbK.append(", className=");
                strP = v0.a.i(sbK, d, ")");
            } else {
                str = ", enter=";
                if (activityDestination instanceof ExternalAppDestination) {
                    strP = p.a.p("ExternalAppDestination(packageName=", ((ExternalAppDestination) activityDestination).getF98637a(), ")");
                } else if (activityDestination instanceof ChooserActivityDestination) {
                    ChooserActivityDestination chooserActivityDestination = (ChooserActivityDestination) activityDestination;
                    String strA = chooserActivityDestination.getF98625a();
                    int size2 = chooserActivityDestination.getF98627c().size();
                    String strC = chooserActivityDestination.getF98626b();
                    Uri uriD = chooserActivityDestination.getD();
                    StringBuilder sbK2 = v0.a.k(size2, "ChooserActivityDestination(action=", strA, ", categoriesCount=", ", type=");
                    sbK2.append(strC);
                    sbK2.append(", uri=");
                    sbK2.append(uriD);
                    sbK2.append(")");
                    strP = sbK2.toString();
                } else if (activityDestination instanceof SelectorActivityDestination) {
                    SelectorActivityDestination selectorActivityDestination = (SelectorActivityDestination) activityDestination;
                    strP = j6.a.s("SelectorActivityDestination(action=", selectorActivityDestination.getF98668a(), ", category=", selectorActivityDestination.getF98669b(), ")");
                } else if (activityDestination instanceof SettingsDestination) {
                    strP = p.a.p("SettingsDestination(action=", ((SettingsDestination) activityDestination).getF98670a(), ")");
                } else {
                    if (!(activityDestination instanceof FileOpenActivityDestination)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FileOpenActivityDestination fileOpenActivityDestination = (FileOpenActivityDestination) activityDestination;
                    strP = "FileOpenActivityDestination(action=" + fileOpenActivityDestination.getF98639a() + ", fileUri=" + fileOpenActivityDestination.getF98640b() + ", mimeType=" + fileOpenActivityDestination.getF98641c() + ", permissionFlagsCount=" + fileOpenActivityDestination.getD().size() + ")";
                }
            }
            String strH = h(activityNavigateCommand.f98619b);
            Map map = activityNavigateCommand.f98620c;
            String strE = e(map != null ? map.keySet() : null);
            Integer num2 = activityNavigateCommand.d;
            int i = activityNavigateCommand.e;
            String str4 = activityNavigateCommand.f;
            Integer num3 = activityNavigateCommand.f98621g;
            Integer num4 = activityNavigateCommand.f98622h;
            ActivityAnimation activityAnimation = activityNavigateCommand.i;
            if (activityAnimation == null) {
                str2 = ", type=";
                str3 = str4;
                num = num3;
                strP2 = null;
            } else {
                num = num3;
                if (activityAnimation instanceof ActivityAnimation.System) {
                    ActivityAnimation.System system = (ActivityAnimation.System) activityAnimation;
                    str3 = str4;
                    str2 = ", type=";
                    strP2 = "System(enter=" + system.f98616a + ", exit=" + system.f98617b + ")";
                } else {
                    str2 = ", type=";
                    str3 = str4;
                    if (activityAnimation instanceof ActivityAnimation.Expand) {
                        strP2 = p.a.p("Expand(sharedViewStorageKey=", ((ActivityAnimation.Expand) activityAnimation).f98615a, ")");
                    } else {
                        if (!(activityAnimation instanceof ActivityAnimation.ContentTransition)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        strP2 = "ContentTransition(finishCallerAfterEntryTransition=" + ((ActivityAnimation.ContentTransition) activityAnimation).f98614a + ")";
                    }
                }
            }
            boolean z = activityNavigateCommand.f98623j;
            StringBuilder sbM = v0.a.m("ActivityNavigateCommand(destinationType=", strP, ", configType=", strH, ", extrasKeys=");
            sbM.append(strE);
            sbM.append(", requestCode=");
            sbM.append(num2);
            sbM.append(", flags=");
            sbM.append(i);
            sbM.append(str2);
            sbM.append(str3);
            sbM.append(str);
            sbM.append(num);
            sbM.append(", exit=");
            sbM.append(num4);
            sbM.append(", animation=");
            sbM.append(strP2);
            sbM.append(", clearBackstack=");
            sbM.append(z);
            sbM.append(")");
            return sbM.toString();
        }
        if (naviCommand instanceof FragmentNavigateCommand) {
            FragmentNavigateCommand fragmentNavigateCommand = (FragmentNavigateCommand) naviCommand;
            String strP3 = p.a.p("FragmentDestination(clazz=", fragmentNavigateCommand.f98651a.f98650a.getName(), ")");
            String strH2 = h(fragmentNavigateCommand.f98652b);
            boolean z3 = fragmentNavigateCommand.f98653c;
            boolean z4 = fragmentNavigateCommand.d;
            boolean z6 = fragmentNavigateCommand.e;
            boolean z11 = fragmentNavigateCommand.f;
            int i2 = fragmentNavigateCommand.f98654g;
            int i3 = fragmentNavigateCommand.f98655h;
            int i5 = fragmentNavigateCommand.i;
            int i6 = fragmentNavigateCommand.f98656j;
            Intent intent = fragmentNavigateCommand.k;
            String strF = intent != null ? f(intent) : null;
            StringBuilder sbM2 = v0.a.m("FragmentNavigateCommand(destinationType=", strP3, ", configType=", strH2, ", recreateIfExists=");
            t61.a.y(sbM2, z3, ", clear=", z4, ", replace=");
            t61.a.y(sbM2, z6, ", addToBackStack=", z11, ", enter=");
            t61.a.x(sbM2, i2, ", exit=", i3, ", popEnter=");
            t61.a.x(sbM2, i5, ", popExit=", i6, ", implicitIntentForActivity=");
            return v0.a.i(sbM2, strF, ")");
        }
        if (naviCommand instanceof ModalFragmentNavigateCommand) {
            ModalFragmentNavigateCommand modalFragmentNavigateCommand = (ModalFragmentNavigateCommand) naviCommand;
            String strP4 = p.a.p("FragmentDestination(clazz=", modalFragmentNavigateCommand.f98664a.f98650a.getName(), ")");
            g gVar = modalFragmentNavigateCommand.f98665b;
            String strH3 = h(modalFragmentNavigateCommand.f98666c);
            StringBuilder sb6 = new StringBuilder("ModalFragmentNavigateCommand(destinationType=");
            sb6.append(strP4);
            sb6.append(", attachMode=");
            sb6.append(gVar);
            sb6.append(", configType=");
            return v0.a.i(sb6, strH3, ")");
        }
        if (naviCommand instanceof FinishFragmentNavigateCommand) {
            FinishFragmentNavigateCommand finishFragmentNavigateCommand = (FinishFragmentNavigateCommand) naviCommand;
            return "FinishFragmentNavigateCommand(finishActivity=" + finishFragmentNavigateCommand.f98648a + ", finishNonBackStackEntries=" + finishFragmentNavigateCommand.f98649b + ")";
        }
        if (naviCommand instanceof CompositeCommand) {
            return p.a.p("CompositeCommand(commands=", d0.k0(((CompositeCommand) naviCommand).f98629a, null, "[", "]", 0, new soi.a(24), 25), ")");
        }
        if (naviCommand instanceof DeeplinkNavigateCommand) {
            DeeplinkNavigateCommand deeplinkNavigateCommand = (DeeplinkNavigateCommand) naviCommand;
            String name = deeplinkNavigateCommand.f98630a.f98636a.getName();
            String strH4 = h(deeplinkNavigateCommand.f98631b);
            Map map2 = deeplinkNavigateCommand.f98632c;
            String strE2 = e(map2 != null ? map2.keySet() : null);
            String str5 = deeplinkNavigateCommand.d;
            int size3 = deeplinkNavigateCommand.e.size();
            Uri uri2 = deeplinkNavigateCommand.f;
            int i21 = deeplinkNavigateCommand.f98633g;
            String str6 = deeplinkNavigateCommand.f98634h;
            StringBuilder sbM3 = v0.a.m("DeeplinkNavigateCommand(destinationClass=", name, ", configType=", strH4, ", extrasKeys=");
            j6.a.D(sbM3, strE2, ", action=", str5, ", categoriesCount=");
            sbM3.append(size3);
            sbM3.append(", data=");
            sbM3.append(uri2);
            sbM3.append(", flags=");
            sbM3.append(i21);
            sbM3.append(", type=");
            sbM3.append(str6);
            sbM3.append(")");
            return sbM3.toString();
        }
        if (Intrinsics.f(naviCommand, RestartApplicationCommand.f98667a)) {
            return "RestartApplicationCommand";
        }
        if (Intrinsics.f(naviCommand, CollapseApplicationCommand.f98628a)) {
            return "CollapseApplicationCommand";
        }
        if (naviCommand instanceof FinishCommand) {
            FinishCommand finishCommand = (FinishCommand) naviCommand;
            Integer num5 = finishCommand.f98642a;
            Map map3 = finishCommand.f98643b;
            String strE3 = e(map3 != null ? map3.keySet() : null);
            String strH5 = h(finishCommand.f98644c);
            StringBuilder sb9 = new StringBuilder("FinishCommand(result=");
            sb9.append(num5);
            sb9.append(", extrasKeys=");
            sb9.append(strE3);
            sb9.append(", modeType=");
            return v0.a.i(sb9, strH5, ")");
        }
        if (Intrinsics.f(naviCommand, FinishFlowCommand.f98647a)) {
            return "FinishFlowCommand";
        }
        if (naviCommand instanceof FeatureCommand) {
            return p.a.p("FeatureCommand(configType=", h(((FeatureCommand) naviCommand).f98638a), ")");
        }
        if (naviCommand instanceof BrowserCommand) {
            return "BrowserCommand(uri=" + ((BrowserCommand) naviCommand).getF98624a() + ")";
        }
        if (naviCommand instanceof IntentCommand) {
            IntentCommand intentCommand = (IntentCommand) naviCommand;
            return "IntentCommand(intent=" + f(intentCommand.getF98660a()) + ", requestCode=" + intentCommand.getF98661b() + ")";
        }
        if (Intrinsics.f(naviCommand, DummyCommand.f98635a)) {
            return "DummyCommand";
        }
        if (!(naviCommand instanceof IntentSenderCommand)) {
            throw new NoWhenBranchMatchedException();
        }
        IntentSenderCommand intentSenderCommand = (IntentSenderCommand) naviCommand;
        return "IntentSenderCommand(intentSenderType=" + h(intentSenderCommand.getF98662a()) + ", requestCode=" + intentSenderCommand.getF98663b() + ")";
    }

    public static final String h(Parcelable parcelable) {
        if (parcelable != null) {
            return parcelable.getClass().getSimpleName();
        }
        return null;
    }
}
