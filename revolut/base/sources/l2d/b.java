package l2d;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.ReorderingBufferQueue;
import androidx.media3.extractor.ts.SeiReader;
import b8d.u;
import com.revolut.data.model.Data;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import efm.w;
import java.util.List;
import java.util.Map;
import kfm.o;
import kfm.p;
import kotlin.jvm.internal.Intrinsics;
import l0c.s;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements o, p, kfm.g, ReorderingBufferQueue.OutputConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f191768b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f191767a = i;
        this.f191768b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f191767a) {
            case 13:
                ((l3l.m) this.f191768b).invoke(obj2);
                break;
            case 14:
                ((l3l.m) this.f191768b).invoke(obj2);
                break;
            case 15:
                ((l3l.m) this.f191768b).invoke(obj2);
                break;
            case 16:
                ((l3l.m) this.f191768b).invoke(obj2);
                break;
            case 17:
                ((l3l.m) this.f191768b).invoke(obj2);
                break;
            case 18:
                ((l3l.m) this.f191768b).invoke(obj2);
                break;
            case 19:
            case 22:
            default:
                ((l3l.p) this.f191768b).invoke(obj2);
                break;
            case 20:
                ((l3l.m) this.f191768b).invoke(obj2);
                break;
            case 21:
                ((l3l.m) this.f191768b).invoke(obj2);
                break;
            case 23:
                ((l3l.m) this.f191768b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f191767a) {
            case 0:
                a aVar = (a) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Map) aVar.invoke(p0);
            case 1:
                kzc.a aVar2 = (kzc.a) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar2.invoke(p0);
            case 2:
                u uVar = (u) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) uVar.invoke(p0);
            case 3:
                u uVar2 = (u) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) uVar2.invoke(p0);
            case 4:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 23:
            case 25:
            default:
                l48.a aVar3 = (l48.a) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) aVar3.invoke(p0);
            case 5:
                c cVar = (c) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) cVar.invoke(p0);
            case 6:
                a aVar4 = (a) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar4.invoke(p0);
            case 7:
                k7c.n nVar = (k7c.n) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (kq2.f) nVar.invoke(p0);
            case 8:
                k7c.n nVar2 = (k7c.n) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (kq2.f) nVar2.invoke(p0);
            case 9:
                a aVar5 = (a) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (krf.a) aVar5.invoke(p0);
            case 10:
                a aVar6 = (a) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (kq2.a) aVar6.invoke(p0);
            case 11:
                s sVar = (s) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) sVar.invoke(p0);
            case 12:
                a aVar7 = (a) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) aVar7.invoke(p0);
            case 19:
                l3l.p pVar = (l3l.p) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) pVar.invoke(p0);
            case 22:
                l3l.p pVar2 = (l3l.p) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) pVar2.invoke(p0);
            case 24:
                l3l.p pVar3 = (l3l.p) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) pVar3.invoke(p0);
            case 26:
                l48.a aVar8 = (l48.a) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar8.invoke(p0);
            case 27:
                l48.a aVar9 = (l48.a) this.f191768b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar9.invoke(p0);
        }
    }

    @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
    public void consume(long j2, ParsableByteArray parsableByteArray) {
        ((SeiReader) this.f191768b).lambda$new$0(j2, parsableByteArray);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        a aVar = (a) this.f191768b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) aVar.invoke(p0)).booleanValue();
    }
}
