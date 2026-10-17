package grl;

/* JADX INFO: loaded from: classes12.dex */
public class s9 implements com.google.protobuf.b1 {
    @Override // com.google.protobuf.b1
    public final com.google.protobuf.a1 findValueByNumber(int i) {
        if (i == 0) {
            return t9.DATA;
        }
        if (i == 1) {
            return t9.EMPTY;
        }
        if (i == 2) {
            return t9.LOADING;
        }
        if (i != 3) {
            return null;
        }
        return t9.ERROR;
    }
}
