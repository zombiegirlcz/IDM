package androidx.glance.appwidget.action;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import androidx.core.os.BundleKt;
import androidx.glance.action.Action;
import androidx.glance.action.ActionParameters;
import androidx.glance.action.LambdaAction;
import androidx.glance.action.StartActivityAction;
import androidx.glance.appwidget.TranslationContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/glance/appwidget/TranslationContext;", "translationContext", "Landroid/widget/RemoteViews;", "rv", "Landroidx/glance/action/Action;", "action", "", "viewId", "", "applyAction", "(Landroidx/glance/appwidget/TranslationContext;Landroid/widget/RemoteViews;Landroidx/glance/action/Action;I)V", "Lkotlin/Function1;", "Landroidx/glance/action/ActionParameters;", "editParams", "Landroid/app/PendingIntent;", "getPendingIntentForAction", "(Landroidx/glance/action/Action;Landroidx/glance/appwidget/TranslationContext;ILkotlin/jvm/functions/Function1;)Landroid/app/PendingIntent;", "Landroid/content/Intent;", "getFillInIntentForAction", "(Landroidx/glance/action/Action;Landroidx/glance/appwidget/TranslationContext;ILkotlin/jvm/functions/Function1;)Landroid/content/Intent;", "Landroidx/glance/appwidget/action/SendBroadcastAction;", "getBroadcastReceiverIntent", "(Landroidx/glance/appwidget/action/SendBroadcastAction;Landroidx/glance/appwidget/TranslationContext;)Landroid/content/Intent;", "Landroidx/glance/action/StartActivityAction;", "params", "getStartActivityIntent", "(Landroidx/glance/action/StartActivityAction;Landroidx/glance/appwidget/TranslationContext;Landroidx/glance/action/ActionParameters;)Landroid/content/Intent;", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ApplyActionKt {

    /* JADX INFO: renamed from: androidx.glance.appwidget.action.ApplyActionKt$getFillInIntentForAction$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/glance/action/ActionParameters;", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<ActionParameters, ActionParameters> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ActionParameters invoke(@NotNull ActionParameters actionParameters) {
            return actionParameters;
        }
    }

    /* JADX INFO: renamed from: androidx.glance.appwidget.action.ApplyActionKt$getPendingIntentForAction$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/glance/action/ActionParameters;", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C19431 extends u implements Function1<ActionParameters, ActionParameters> {
        public static final C19431 INSTANCE = new C19431();

        public C19431() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ActionParameters invoke(@NotNull ActionParameters actionParameters) {
            return actionParameters;
        }
    }

    public static final void applyAction(@NotNull TranslationContext translationContext, @NotNull RemoteViews remoteViews, @NotNull Action action, int i) {
        Integer actionTargetId = translationContext.getActionTargetId();
        if (actionTargetId != null) {
            i = actionTargetId.intValue();
        }
        int i2 = i;
        try {
        } catch (Throwable th10) {
            th = th10;
        }
        try {
            if (translationContext.getIsLazyCollectionDescendant()) {
                remoteViews.setOnClickFillInIntent(i2, getFillInIntentForAction$default(action, translationContext, i2, null, 8, null));
            } else {
                remoteViews.setOnClickPendingIntent(i2, getPendingIntentForAction$default(action, translationContext, i2, null, 8, null));
            }
        } catch (Throwable th11) {
            th = th11;
            String str = "Unrecognized Action: " + action;
        }
    }

    private static final Intent getBroadcastReceiverIntent(SendBroadcastAction sendBroadcastAction, TranslationContext translationContext) {
        if (sendBroadcastAction instanceof SendBroadcastIntentAction) {
            return ((SendBroadcastIntentAction) sendBroadcastAction).getIntent();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final Intent getFillInIntentForAction(Action action, TranslationContext translationContext, int i, Function1<? super ActionParameters, ? extends ActionParameters> function1) {
        if (action instanceof StartActivityAction) {
            StartActivityAction startActivityAction = (StartActivityAction) action;
            return ActionTrampolineKt.applyTrampolineIntent(getStartActivityIntent(startActivityAction, translationContext, (ActionParameters) function1.invoke(startActivityAction.getParameters())), translationContext, i, ActionTrampolineType.ACTIVITY, startActivityAction.getActivityOptions());
        }
        if (action instanceof SendBroadcastAction) {
            return ActionTrampolineKt.applyTrampolineIntent$default(getBroadcastReceiverIntent((SendBroadcastAction) action, translationContext), translationContext, i, ActionTrampolineType.BROADCAST, null, 8, null);
        }
        if (action instanceof LambdaAction) {
            if (translationContext.getActionBroadcastReceiver() != null) {
                return ActionTrampolineKt.applyTrampolineIntent$default(LambdaActionBroadcasts.INSTANCE.createIntent$glance_appwidget_release(translationContext.getActionBroadcastReceiver(), ((LambdaAction) action).getKey(), translationContext.getAppWidgetId()), translationContext, i, ActionTrampolineType.BROADCAST, null, 8, null);
            }
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        throw new IllegalStateException(("Cannot create fill-in Intent for action type: " + action).toString());
    }

    public static /* synthetic */ Intent getFillInIntentForAction$default(Action action, TranslationContext translationContext, int i, Function1 function1, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            function1 = AnonymousClass1.INSTANCE;
        }
        return getFillInIntentForAction(action, translationContext, i, function1);
    }

    private static final PendingIntent getPendingIntentForAction(Action action, TranslationContext translationContext, int i, Function1<? super ActionParameters, ? extends ActionParameters> function1) {
        if (action instanceof StartActivityAction) {
            StartActivityAction startActivityAction = (StartActivityAction) action;
            ActionParameters actionParameters = (ActionParameters) function1.invoke(startActivityAction.getParameters());
            Context context = translationContext.getContext();
            Intent startActivityIntent = getStartActivityIntent(startActivityAction, translationContext, actionParameters);
            if (startActivityIntent.getData() == null) {
                startActivityIntent.setData(ActionTrampolineKt.createUniqueUri$default(translationContext, i, ActionTrampolineType.CALLBACK, null, 8, null));
            }
            Unit unit = Unit.f186387a;
            return PendingIntent.getActivity(context, 0, startActivityIntent, 167772160, startActivityAction.getActivityOptions());
        }
        if (action instanceof SendBroadcastAction) {
            Context context2 = translationContext.getContext();
            Intent broadcastReceiverIntent = getBroadcastReceiverIntent((SendBroadcastAction) action, translationContext);
            if (broadcastReceiverIntent.getData() == null) {
                broadcastReceiverIntent.setData(ActionTrampolineKt.createUniqueUri$default(translationContext, i, ActionTrampolineType.CALLBACK, null, 8, null));
            }
            Unit unit2 = Unit.f186387a;
            return PendingIntent.getBroadcast(context2, 0, broadcastReceiverIntent, 167772160);
        }
        if (!(action instanceof LambdaAction)) {
            throw new IllegalStateException(("Cannot create PendingIntent for action type: " + action).toString());
        }
        if (translationContext.getActionBroadcastReceiver() == null) {
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        Context context3 = translationContext.getContext();
        LambdaAction lambdaAction = (LambdaAction) action;
        Intent intentCreateIntent$glance_appwidget_release = LambdaActionBroadcasts.INSTANCE.createIntent$glance_appwidget_release(translationContext.getActionBroadcastReceiver(), lambdaAction.getKey(), translationContext.getAppWidgetId());
        intentCreateIntent$glance_appwidget_release.setData(ActionTrampolineKt.createUniqueUri(translationContext, i, ActionTrampolineType.CALLBACK, lambdaAction.getKey()));
        Unit unit3 = Unit.f186387a;
        return PendingIntent.getBroadcast(context3, 0, intentCreateIntent$glance_appwidget_release, 167772160);
    }

    public static /* synthetic */ PendingIntent getPendingIntentForAction$default(Action action, TranslationContext translationContext, int i, Function1 function1, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            function1 = C19431.INSTANCE;
        }
        return getPendingIntentForAction(action, translationContext, i, function1);
    }

    private static final Intent getStartActivityIntent(StartActivityAction startActivityAction, TranslationContext translationContext, ActionParameters actionParameters) {
        if (!(startActivityAction instanceof StartActivityIntentAction)) {
            throw new IllegalStateException(("Action type not defined in app widget package: " + startActivityAction).toString());
        }
        Intent intent = ((StartActivityIntentAction) startActivityAction).getIntent();
        Map<ActionParameters.Key<? extends Object>, Object> mapAsMap = actionParameters.asMap();
        ArrayList arrayList = new ArrayList(mapAsMap.size());
        for (Map.Entry<ActionParameters.Key<? extends Object>, Object> entry : mapAsMap.entrySet()) {
            arrayList.add(new Pair(entry.getKey().getName(), entry.getValue()));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        intent.putExtras(BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
        return intent;
    }
}
