package t70;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f268390a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, r rVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f268390a = rVar;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        r rVar = this.f268390a;
        if (rVar != null) {
            return rVar;
        }
        Resources resources = super.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return resources;
    }
}
