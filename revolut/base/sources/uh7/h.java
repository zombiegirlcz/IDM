package uh7;

import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f280114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f280115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ph7.c f280116c;

    public h(j jVar, String str, dsh.e eVar, ph7.c cVar) {
        this.f280114a = jVar;
        this.f280115b = str;
        this.f280116c = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        List instruments = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        return this.f280114a.f280119h.d(this.f280115b, this.f280116c, instruments);
    }
}
