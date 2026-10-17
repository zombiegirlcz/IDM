package bmm;

import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16945a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f16946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16947c;
    public final /* synthetic */ List d;

    public /* synthetic */ m(u uVar, int i, List list) {
        this.f16946b = uVar;
        this.f16947c = i;
        this.d = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16945a) {
            case 0:
                u uVar = this.f16946b;
                int i = this.f16947c;
                List requestHeaders = this.d;
                uVar.k.getClass();
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                try {
                    uVar.f16976x.i(i, b.CANCEL);
                    synchronized (uVar) {
                        uVar.z.remove(Integer.valueOf(i));
                        Unit unit = Unit.f186387a;
                    }
                } catch (IOException unused) {
                }
                return Unit.f186387a;
            default:
                u uVar2 = this.f16946b;
                int i2 = this.f16947c;
                List responseHeaders = this.d;
                uVar2.k.getClass();
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                try {
                    uVar2.f16976x.i(i2, b.CANCEL);
                    synchronized (uVar2) {
                        uVar2.z.remove(Integer.valueOf(i2));
                        Unit unit2 = Unit.f186387a;
                    }
                } catch (IOException unused2) {
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ m(u uVar, int i, List list, boolean z) {
        this.f16946b = uVar;
        this.f16947c = i;
        this.d = list;
    }
}
