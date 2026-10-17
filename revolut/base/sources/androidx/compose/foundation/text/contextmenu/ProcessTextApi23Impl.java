package androidx.compose.foundation.text.contextmenu;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.ui.text.TextRange;
import fp1.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import nyb.m;
import oim.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\n*\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015R:\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00130\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cRL\u0010\"\u001a&\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010\u0003\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/ProcessTextApi23Impl;", "", "<init>", "()V", "Landroid/content/Intent;", "createProcessTextIntent", "()Landroid/content/Intent;", "Landroid/content/pm/ResolveInfo;", "Landroid/content/Context;", "context", "", "hasPermission", "(Landroid/content/pm/ResolveInfo;Landroid/content/Context;)Z", "Landroid/content/pm/ActivityInfo;", "(Landroid/content/pm/ActivityInfo;Landroid/content/Context;)Z", "info", "editable", "createProcessTextIntentForResolveInfo", "(Landroid/content/pm/ResolveInfo;Z)Landroid/content/Intent;", "", "queryProcessTextActivities", "(Landroid/content/Context;)Ljava/util/List;", "Lkotlin/Function1;", "processTextActivitiesQuery", "Lkotlin/jvm/functions/Function1;", "getProcessTextActivitiesQuery", "()Lkotlin/jvm/functions/Function1;", "setProcessTextActivitiesQuery", "(Lkotlin/jvm/functions/Function1;)V", "getProcessTextActivitiesQuery$annotations", "Lkotlin/Function5;", "", "Landroidx/compose/ui/text/TextRange;", "", "onClickProcessTextItem", "Loim/o;", "getOnClickProcessTextItem", "()Loim/o;", "setOnClickProcessTextItem", "(Loim/o;)V", "getOnClickProcessTextItem$annotations", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessTextApi23Impl {

    @NotNull
    public static final ProcessTextApi23Impl INSTANCE = new ProcessTextApi23Impl();

    @NotNull
    private static Function1<? super Context, ? extends List<? extends ResolveInfo>> processTextActivitiesQuery = new m(29);

    @NotNull
    private static o onClickProcessTextItem = new e(1);
    public static final int $stable = 8;

    private ProcessTextApi23Impl() {
    }

    private final Intent createProcessTextIntent() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }

    private final boolean hasPermission(ResolveInfo resolveInfo, Context context) {
        return context.getPackageName().equals(resolveInfo.activityInfo.packageName) || hasPermission(resolveInfo.activityInfo, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClickProcessTextItem$lambda$0(Context context, ResolveInfo resolveInfo, boolean z, CharSequence charSequence, TextRange textRange) {
        String string = charSequence.subSequence(TextRange.m2957getMinimpl(textRange.getPackedValue()), TextRange.m2956getMaximpl(textRange.getPackedValue())).toString();
        Intent intentCreateProcessTextIntentForResolveInfo = INSTANCE.createProcessTextIntentForResolveInfo(resolveInfo, z);
        intentCreateProcessTextIntentForResolveInfo.putExtra("android.intent.extra.PROCESS_TEXT", string);
        context.startActivity(intentCreateProcessTextIntentForResolveInfo);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List processTextActivitiesQuery$lambda$0(Context context) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(INSTANCE.createProcessTextIntent(), 0);
        ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
        int size = listQueryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            ResolveInfo resolveInfo = listQueryIntentActivities.get(i);
            if (INSTANCE.hasPermission(resolveInfo, context)) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    @NotNull
    public final Intent createProcessTextIntentForResolveInfo(@NotNull ResolveInfo info, boolean editable) {
        Intent intentPutExtra = createProcessTextIntent().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", editable);
        ActivityInfo activityInfo = info.activityInfo;
        return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
    }

    @NotNull
    public final o getOnClickProcessTextItem() {
        return onClickProcessTextItem;
    }

    @NotNull
    public final List<ResolveInfo> queryProcessTextActivities(@NotNull Context context) {
        return (List) processTextActivitiesQuery.invoke(context);
    }

    private final boolean hasPermission(ActivityInfo activityInfo, Context context) {
        if (!activityInfo.exported) {
            return false;
        }
        String str = activityInfo.permission;
        return str == null || context.checkSelfPermission(str) == 0;
    }
}
