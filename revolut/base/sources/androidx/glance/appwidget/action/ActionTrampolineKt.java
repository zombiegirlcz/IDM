package androidx.glance.appwidget.action;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import androidx.compose.ui.unit.DpSize;
import androidx.glance.appwidget.TranslationContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroid/content/Intent;", "Landroidx/glance/appwidget/TranslationContext;", "translationContext", "", "viewId", "Landroidx/glance/appwidget/action/ActionTrampolineType;", "type", "Landroid/os/Bundle;", "activityOptions", "applyTrampolineIntent", "(Landroid/content/Intent;Landroidx/glance/appwidget/TranslationContext;ILandroidx/glance/appwidget/action/ActionTrampolineType;Landroid/os/Bundle;)Landroid/content/Intent;", "", "extraData", "Landroid/net/Uri;", "createUniqueUri", "(Landroidx/glance/appwidget/TranslationContext;ILandroidx/glance/appwidget/action/ActionTrampolineType;Ljava/lang/String;)Landroid/net/Uri;", "Landroid/app/Activity;", "intent", "", "launchTrampolineAction", "(Landroid/app/Activity;Landroid/content/Intent;)V", "Lkotlin/Function0;", "block", "allowUnsafeIntentLaunch", "(Lkotlin/jvm/functions/Function0;)V", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class ActionTrampolineKt {

    /* JADX INFO: renamed from: androidx.glance.appwidget.action.ActionTrampolineKt$launchTrampolineAction$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<Unit> {
        final /* synthetic */ Intent $actionIntent;
        final /* synthetic */ Bundle $activityOptions;
        final /* synthetic */ Activity $this_launchTrampolineAction;
        final /* synthetic */ String $type;

        /* JADX INFO: renamed from: androidx.glance.appwidget.action.ActionTrampolineKt$launchTrampolineAction$1$WhenMappings */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ActionTrampolineType.values().length];
                try {
                    iArr[ActionTrampolineType.ACTIVITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ActionTrampolineType.BROADCAST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ActionTrampolineType.CALLBACK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ActionTrampolineType.SERVICE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ActionTrampolineType.FOREGROUND_SERVICE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Activity activity, Intent intent, Bundle bundle) {
            super(0);
            this.$type = str;
            this.$this_launchTrampolineAction = activity;
            this.$actionIntent = intent;
            this.$activityOptions = bundle;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3509invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3509invoke() {
            int i = WhenMappings.$EnumSwitchMapping$0[ActionTrampolineType.valueOf(this.$type).ordinal()];
            if (i == 1) {
                this.$this_launchTrampolineAction.startActivity(this.$actionIntent, this.$activityOptions);
                return;
            }
            if (i == 2 || i == 3) {
                this.$this_launchTrampolineAction.sendBroadcast(this.$actionIntent);
            } else if (i == 4) {
                this.$this_launchTrampolineAction.startService(this.$actionIntent);
            } else {
                if (i != 5) {
                    return;
                }
                ListAdapterTrampolineApi26Impl.INSTANCE.startForegroundService(this.$this_launchTrampolineAction, this.$actionIntent);
            }
        }
    }

    public static final void allowUnsafeIntentLaunch(@NotNull Function0<Unit> function0) {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(Build.VERSION.SDK_INT >= 31 ? StrictModeVmPolicyApi31Impl.INSTANCE.permitUnsafeIntentLaunch(new StrictMode.VmPolicy.Builder(vmPolicy)).build() : new StrictMode.VmPolicy.Builder().build());
        function0.invoke();
        StrictMode.setVmPolicy(vmPolicy);
    }

    @NotNull
    public static final Intent applyTrampolineIntent(@NotNull Intent intent, @NotNull TranslationContext translationContext, int i, @NotNull ActionTrampolineType actionTrampolineType, Bundle bundle) {
        Intent intent2 = new Intent(translationContext.getContext(), (Class<?>) (actionTrampolineType == ActionTrampolineType.ACTIVITY ? ActionTrampolineActivity.class : InvisibleActionTrampolineActivity.class));
        intent2.setData(createUniqueUri$default(translationContext, i, actionTrampolineType, null, 8, null));
        intent2.putExtra("ACTION_TYPE", actionTrampolineType.name());
        intent2.putExtra("ACTION_INTENT", intent);
        if (bundle != null) {
            intent2.putExtra("ACTIVITY_OPTIONS", bundle);
        }
        return intent2;
    }

    public static /* synthetic */ Intent applyTrampolineIntent$default(Intent intent, TranslationContext translationContext, int i, ActionTrampolineType actionTrampolineType, Bundle bundle, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            bundle = null;
        }
        return applyTrampolineIntent(intent, translationContext, i, actionTrampolineType, bundle);
    }

    @NotNull
    public static final Uri createUniqueUri(@NotNull TranslationContext translationContext, int i, @NotNull ActionTrampolineType actionTrampolineType, @NotNull String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        builder.path(actionTrampolineType.name());
        builder.appendQueryParameter("appWidgetId", String.valueOf(translationContext.getAppWidgetId()));
        builder.appendQueryParameter("viewId", String.valueOf(i));
        builder.appendQueryParameter("viewSize", DpSize.m3324toStringimpl(translationContext.getLayoutSize()));
        builder.appendQueryParameter("extraData", str);
        if (translationContext.getIsLazyCollectionDescendant()) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(translationContext.getLayoutCollectionViewId()));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(translationContext.getLayoutCollectionItemId()));
        }
        return builder.build();
    }

    public static /* synthetic */ Uri createUniqueUri$default(TranslationContext translationContext, int i, ActionTrampolineType actionTrampolineType, String str, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            str = "";
        }
        return createUniqueUri(translationContext, i, actionTrampolineType, str);
    }

    public static final void launchTrampolineAction(@NotNull Activity activity, @NotNull Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without specifying target intent.");
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without trampoline type");
        }
        allowUnsafeIntentLaunch(new AnonymousClass1(stringExtra, activity, intent2, intent.getBundleExtra("ACTIVITY_OPTIONS")));
        activity.finish();
    }
}
