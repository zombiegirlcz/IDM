package l25;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f191618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f191619c;

    public /* synthetic */ a(u uVar, String str, int i) {
        this.f191617a = i;
        this.f191618b = uVar;
        this.f191619c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        zx4.d result = (zx4.d) obj2;
        switch (this.f191617a) {
            case 0:
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof zx4.b) {
                    this.f191618b.l3(this.f191619c, null);
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof zx4.b) {
                    this.f191618b.l3(this.f191619c, null);
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof zx4.b) {
                    this.f191618b.l3(this.f191619c, null);
                }
                break;
            default:
                boolean zF = Intrinsics.f(result, zx4.b.f326040a);
                Continuation continuation = null;
                u uVar = this.f191618b;
                String str = this.f191619c;
                if (zF) {
                    uVar.l3(str, null);
                } else if (Intrinsics.f(result, zx4.c.f326041a)) {
                    uVar.V2(new i(uVar, str, continuation, 2), new yi5.b(29));
                }
                break;
        }
        return Unit.f186387a;
    }
}
