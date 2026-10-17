package ho2;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wi0.b f154213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f154214c;

    public /* synthetic */ i(int i, String str, wi0.b bVar) {
        this.f154212a = i;
        this.f154213b = bVar;
        this.f154214c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f154212a) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e.a(update, this.f154213b, this.f154214c, null, 4);
            case 1:
                n0f.d update2 = (n0f.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                update2.getClass();
                return new n0f.d(this.f154213b, this.f154214c);
            case 2:
                o22.a update3 = (o22.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return o22.a.a(update3, null, new Data(new o22.b(this.f154213b, this.f154214c), null, false, 6, null), null, null, 29);
            default:
                q22.a update4 = (q22.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return q22.a.a(update4, null, this.f154213b, this.f154214c, null, null, null, null, false, false, 505);
        }
    }
}
