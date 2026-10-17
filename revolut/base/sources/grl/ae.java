package grl;

/* JADX INFO: loaded from: classes12.dex */
public class ae implements com.google.protobuf.b1 {
    @Override // com.google.protobuf.b1
    public final com.google.protobuf.a1 findValueByNumber(int i) {
        if (i == 0) {
            return be.NOT_DETECTED;
        }
        if (i == 1) {
            return be.DETECTED_INVALID;
        }
        if (i != 2) {
            return null;
        }
        return be.DETECTED_VALID;
    }
}
