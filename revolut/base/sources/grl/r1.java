package grl;

/* JADX INFO: loaded from: classes12.dex */
public class r1 implements com.google.protobuf.b1 {
    @Override // com.google.protobuf.b1
    public final com.google.protobuf.a1 findValueByNumber(int i) {
        if (i == 0) {
            return s1.DISABLED;
        }
        if (i == 1) {
            return s1.AUTOMATIC;
        }
        if (i != 2) {
            return null;
        }
        return s1.MANUAL;
    }
}
