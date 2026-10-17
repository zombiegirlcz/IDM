package ny0;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes20.dex */
public final class v implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f220615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f220616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f220617c;
    public final /* synthetic */ Function1 d;

    public v(w wVar, Ref$ObjectRef ref$ObjectRef, c cVar, Function1 function1) {
        this.f220615a = wVar;
        this.f220616b = ref$ObjectRef;
        this.f220617c = cVar;
        this.d = function1;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Context context = v.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = z92.f.i(context);
        if (activityI == null) {
            return;
        }
        activityI.registerComponentCallbacks(this.f220615a);
        Configuration configuration = v.getContext().getResources().getConfiguration();
        Ref$ObjectRef ref$ObjectRef = this.f220616b;
        Configuration configuration2 = (Configuration) ref$ObjectRef.f186409a;
        if (configuration2 != null && configuration.diff(configuration2) != 0 && this.f220617c.a(configuration2, configuration)) {
            this.d.invoke(configuration);
        }
        ref$ObjectRef.f186409a = new Configuration(configuration);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Context context = v.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = z92.f.i(context);
        if (activityI == null) {
            return;
        }
        activityI.unregisterComponentCallbacks(this.f220615a);
    }
}
