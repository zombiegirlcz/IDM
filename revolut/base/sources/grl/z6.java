package grl;

/* JADX INFO: loaded from: classes13.dex */
public class z6 implements com.google.protobuf.b1 {
    @Override // com.google.protobuf.b1
    public final com.google.protobuf.a1 findValueByNumber(int i) {
        if (i == 0) {
            return a7.UnspecifiedOS;
        }
        if (i == 1) {
            return a7.iOS;
        }
        if (i != 2) {
            return null;
        }
        return a7.Android;
    }
}
