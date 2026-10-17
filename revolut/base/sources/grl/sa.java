package grl;

/* JADX INFO: loaded from: classes13.dex */
public class sa implements com.google.protobuf.b1 {
    @Override // com.google.protobuf.b1
    public final com.google.protobuf.a1 findValueByNumber(int i) {
        if (i == 0) {
            return ta.opened;
        }
        if (i != 1) {
            return null;
        }
        return ta.closed;
    }
}
