package w4l;

import com.revolut.data.model.Data;
import kfm.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Data f294647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f294648b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f294649c;
    public Integer d;
    public int e;

    public static int a(Data data) {
        String message;
        Object content = data.getContent();
        int iHashCode = 0;
        int iHashCode2 = (content != null ? content.hashCode() : 0) * 31;
        Throwable error = data.getError();
        int iHashCode3 = (iHashCode2 + (error != null ? error.getClass().hashCode() : 0)) * 31;
        Throwable error2 = data.getError();
        if (error2 != null && (message = error2.getMessage()) != null) {
            iHashCode = message.hashCode();
        }
        return iHashCode3 + iHashCode;
    }

    @Override // kfm.p
    public final boolean test(Object obj2) {
        boolean z;
        Data data = (Data) obj2;
        Intrinsics.checkNotNullParameter(data, "data");
        Data data2 = this.f294647a;
        if (Intrinsics.f(data2, data)) {
            return false;
        }
        this.f294647a = data;
        if (data2 == null) {
            return true;
        }
        Integer numValueOf = this.f294649c;
        Integer numValueOf2 = this.d;
        if (numValueOf == null && numValueOf2 == null) {
            int iA = a(data2);
            if (data2.getLoading()) {
                this.f294649c = Integer.valueOf(iA);
                numValueOf = Integer.valueOf(iA);
                this.e++;
            } else {
                this.d = Integer.valueOf(iA);
                numValueOf2 = Integer.valueOf(iA);
                this.e = 1;
            }
        }
        int iA2 = a(data);
        if (data.getLoading()) {
            if (numValueOf == null || iA2 == numValueOf.intValue()) {
                this.e++;
            }
            z = this.e <= 2;
            this.f294648b = z;
            this.f294649c = Integer.valueOf(iA2);
            return z;
        }
        if ((numValueOf == null || iA2 != numValueOf.intValue()) && (numValueOf2 == null || iA2 != numValueOf2.intValue())) {
            this.e = 1;
        }
        z = numValueOf2 == null || iA2 != numValueOf2.intValue() || this.f294648b;
        this.d = Integer.valueOf(iA2);
        return z;
    }
}
