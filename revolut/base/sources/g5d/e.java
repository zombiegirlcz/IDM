package g5d;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f140757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f140758c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public /* synthetic */ e(g gVar, String str, String str2, long j2, long j3, int i) {
        this.f140756a = i;
        this.f140757b = gVar;
        this.f140758c = str;
        this.d = str2;
        this.e = j2;
        this.f = j3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f140756a) {
            case 0:
                g gVar = (g) this.f140757b;
                gVar.getClass();
                return d.b(gVar, this.f140758c, (String) this.d, this.e, this.f, (Continuation) obj2);
            case 1:
                g gVar2 = (g) this.f140757b;
                gVar2.getClass();
                return d.a(gVar2, this.f140758c, (String) this.d, this.e, this.f, (Continuation) obj2);
            default:
                return rqj.h.e((rqj.j) this.f140757b, this.f140758c, this.e, this.f, (ArrayList) this.d, (Continuation) obj2);
        }
    }

    public /* synthetic */ e(rqj.j jVar, String str, long j2, long j3, ArrayList arrayList) {
        this.f140756a = 2;
        this.f140757b = jVar;
        this.f140758c = str;
        this.e = j2;
        this.f = j3;
        this.d = arrayList;
    }
}
