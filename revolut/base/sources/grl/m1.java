package grl;

/* JADX INFO: loaded from: classes12.dex */
public class m1 implements com.google.protobuf.b1 {
    @Override // com.google.protobuf.b1
    public final com.google.protobuf.a1 findValueByNumber(int i) {
        if (i == 0) {
            return n1.NORMAL;
        }
        if (i != 1) {
            return null;
        }
        return n1.TILT;
    }
}
