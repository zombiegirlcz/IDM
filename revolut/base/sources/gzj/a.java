package gzj;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f148139b;

    public /* synthetic */ a(d dVar, int i) {
        this.f148138a = i;
        this.f148139b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        mzj.d it8 = (mzj.d) obj2;
        switch (this.f148138a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f148139b.f148149s.getClass();
                return mzj.g.a(it8);
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f148139b.f148149s.getClass();
                return mzj.g.b(it8);
        }
    }
}
