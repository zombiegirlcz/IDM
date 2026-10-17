package grl;

/* JADX INFO: loaded from: classes13.dex */
public class nb implements com.google.protobuf.b1 {
    @Override // com.google.protobuf.b1
    public final com.google.protobuf.a1 findValueByNumber(int i) {
        if (i == 0) {
            return ob.Enabled;
        }
        if (i == 1) {
            return ob.Disabled;
        }
        if (i != 2) {
            return null;
        }
        return ob.Unavailable;
    }
}
