package grl;

/* JADX INFO: loaded from: classes12.dex */
public class u implements com.google.protobuf.b1 {
    @Override // com.google.protobuf.b1
    public final com.google.protobuf.a1 findValueByNumber(int i) {
        switch (i) {
            case 0:
                return v.PERSONAL;
            case 1:
                return v.JOINT;
            case 2:
                return v.LINKED;
            case 3:
                return v.PRO;
            case 4:
                return v.SAVINGS;
            case 5:
                return v.CREDIT;
            case 6:
                return v.YOUTH;
            default:
                return null;
        }
    }
}
