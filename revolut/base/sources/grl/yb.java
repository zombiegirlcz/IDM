package grl;

/* JADX INFO: loaded from: classes13.dex */
public class yb implements com.google.protobuf.b1 {
    @Override // com.google.protobuf.b1
    public final com.google.protobuf.a1 findValueByNumber(int i) {
        if (i == 0) {
            return zb.Light;
        }
        if (i == 1) {
            return zb.Dark;
        }
        if (i == 2) {
            return zb.System;
        }
        if (i != 3) {
            return null;
        }
        return zb.Transparent;
    }
}
