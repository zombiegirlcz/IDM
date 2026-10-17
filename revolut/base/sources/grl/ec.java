package grl;

/* JADX INFO: loaded from: classes13.dex */
public class ec implements com.google.protobuf.b1 {
    @Override // com.google.protobuf.b1
    public final com.google.protobuf.a1 findValueByNumber(int i) {
        if (i == 0) {
            return fc.Face;
        }
        if (i == 1) {
            return fc.Fingerprint;
        }
        if (i != 2) {
            return null;
        }
        return fc.Pin;
    }
}
