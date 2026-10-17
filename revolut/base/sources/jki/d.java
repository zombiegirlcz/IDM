package jki;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDocuments;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import q35.z;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class d extends q implements Function2 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f) {
            case 0:
                break;
            case 1:
                xx4.b p0 = (xx4.b) obj2;
                LoanDetails p17 = (LoanDetails) obj3;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                ((xx4.d) this.receiver).b(p0, p17);
                break;
            case 2:
                xx4.b p03 = (xx4.b) obj2;
                List p110 = (List) obj3;
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p110, "p1");
                ((xx4.d) this.receiver).b(p03, p110);
                break;
            case 3:
                xx4.b p010 = (xx4.b) obj2;
                z p111 = (z) obj3;
                Intrinsics.checkNotNullParameter(p010, "p0");
                Intrinsics.checkNotNullParameter(p111, "p1");
                ((xx4.d) this.receiver).b(p010, p111);
                break;
            case 4:
                xx4.b p011 = (xx4.b) obj2;
                List p112 = (List) obj3;
                Intrinsics.checkNotNullParameter(p011, "p0");
                Intrinsics.checkNotNullParameter(p112, "p1");
                ((xx4.d) this.receiver).b(p011, p112);
                break;
            case 5:
                xx4.b p012 = (xx4.b) obj2;
                List p113 = (List) obj3;
                Intrinsics.checkNotNullParameter(p012, "p0");
                Intrinsics.checkNotNullParameter(p113, "p1");
                ((xx4.d) this.receiver).b(p012, p113);
                break;
            case 6:
                xx4.b p013 = (xx4.b) obj2;
                ux4.b p114 = (ux4.b) obj3;
                Intrinsics.checkNotNullParameter(p013, "p0");
                Intrinsics.checkNotNullParameter(p114, "p1");
                ((xx4.d) this.receiver).b(p013, p114);
                break;
            case 7:
                xx4.b p014 = (xx4.b) obj2;
                ux4.b p115 = (ux4.b) obj3;
                Intrinsics.checkNotNullParameter(p014, "p0");
                Intrinsics.checkNotNullParameter(p115, "p1");
                ((xx4.d) this.receiver).b(p014, p115);
                break;
            case 8:
                xx4.b p015 = (xx4.b) obj2;
                LoanDocuments p116 = (LoanDocuments) obj3;
                Intrinsics.checkNotNullParameter(p015, "p0");
                Intrinsics.checkNotNullParameter(p116, "p1");
                ((xx4.d) this.receiver).b(p015, p116);
                break;
            case 9:
                xx4.b p016 = (xx4.b) obj2;
                List p117 = (List) obj3;
                Intrinsics.checkNotNullParameter(p016, "p0");
                Intrinsics.checkNotNullParameter(p117, "p1");
                ((xx4.d) this.receiver).b(p016, p117);
                break;
            default:
                String p017 = (String) obj2;
                String p118 = (String) obj3;
                Intrinsics.checkNotNullParameter(p017, "p0");
                Intrinsics.checkNotNullParameter(p118, "p1");
                z9h.n.l(String.class, (ue0.c) this.receiver, p017, p118);
                break;
        }
        return Unit.f186387a;
    }
}
