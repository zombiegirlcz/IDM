package grl;

/* JADX INFO: loaded from: classes12.dex */
public class s4 implements com.google.protobuf.b1 {
    @Override // com.google.protobuf.b1
    public final com.google.protobuf.a1 findValueByNumber(int i) {
        if (i == 0) {
            return t4.ACTIVE;
        }
        if (i != 1) {
            return null;
        }
        return t4.INACTIVE;
    }
}
