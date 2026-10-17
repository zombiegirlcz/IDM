package gl3;

import efm.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f144543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f144544c;

    public /* synthetic */ c(f fVar, Long l2, int i) {
        this.f144542a = i;
        this.f144543b = fVar;
        this.f144544c = l2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Boolean it8 = (Boolean) obj2;
        switch (this.f144542a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                f fVar = this.f144543b;
                r rVarUsing = r.using(new a(fVar, this.f144544c, 2), new gjg.e(new gk7.a(15), 17), new gjg.e(new gk7.a(16), 18));
                Intrinsics.checkNotNullExpressionValue(rVarUsing, "using(...)");
                r rVarA0 = w.a0(rVarUsing, new d(fVar, 1));
                r rVarEmpty = r.empty();
                Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
                return ue0.e.z(rVarA0, rVarEmpty);
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                f fVar2 = this.f144543b;
                r map = r.using(new a(fVar2, this.f144544c, 1), new gjg.e(new gk7.a(13), 13), new gjg.e(new gk7.a(14), 15)).map(new gjg.e(new d(fVar2, 0), 16));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                r rVarEmpty2 = r.empty();
                Intrinsics.checkNotNullExpressionValue(rVarEmpty2, "empty(...)");
                return ue0.e.z(map, rVarEmpty2);
        }
    }
}
