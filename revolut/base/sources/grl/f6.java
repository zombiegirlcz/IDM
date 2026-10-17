package grl;

/* JADX INFO: loaded from: classes12.dex */
public class f6 implements com.google.protobuf.b1 {
    @Override // com.google.protobuf.b1
    public final com.google.protobuf.a1 findValueByNumber(int i) {
        switch (i) {
            case 0:
                return g6.GIA;
            case 1:
                return g6.GIA_JOINT;
            case 2:
                return g6.ISA;
            case 3:
                return g6.PEA;
            case 4:
                return g6.JISA;
            case 5:
                return g6.ROBO;
            case 6:
                return g6.CFD;
            default:
                return null;
        }
    }
}
