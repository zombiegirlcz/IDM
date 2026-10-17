package grl;

/* JADX INFO: loaded from: classes12.dex */
public class b0 implements com.google.protobuf.b1 {
    @Override // com.google.protobuf.b1
    public final com.google.protobuf.a1 findValueByNumber(int i) {
        if (i == 0) {
            return c0.light;
        }
        if (i == 1) {
            return c0.dark;
        }
        if (i != 2) {
            return null;
        }
        return c0.system;
    }
}
