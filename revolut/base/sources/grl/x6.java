package grl;

/* JADX INFO: loaded from: classes13.dex */
public class x6 implements com.google.protobuf.b1 {
    @Override // com.google.protobuf.b1
    public final com.google.protobuf.a1 findValueByNumber(int i) {
        if (i == 0) {
            return y6.UnspecifiedCategory;
        }
        if (i == 1) {
            return y6.Mobile;
        }
        if (i == 2) {
            return y6.Tablet;
        }
        if (i != 3) {
            return null;
        }
        return y6.Desktop;
    }
}
