package wv0;

import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wv0.d;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d.b f300254b;

    public /* synthetic */ b(d.b bVar, int i) {
        this.f300253a = i;
        this.f300254b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f300253a) {
            case 0:
                Context context = (Context) obj2;
                Intrinsics.checkNotNullParameter(context, "context");
                d dVar = new d(context, null, 6, 0);
                dVar.setModel(this.f300254b);
                return dVar;
            default:
                View view = (View) obj2;
                Intrinsics.checkNotNullParameter(view, "view");
                d dVar2 = view instanceof d ? (d) view : null;
                if (dVar2 != null) {
                    dVar2.setModel(this.f300254b);
                }
                return Unit.f186387a;
        }
    }
}
