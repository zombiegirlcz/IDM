package gcm;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NO_ERROR' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes22.dex */
public final class n1 {
    private static final /* synthetic */ n1[] $VALUES;
    public static final n1 CANCEL;
    public static final n1 COMPRESSION_ERROR;
    public static final n1 CONNECT_ERROR;
    public static final n1 ENHANCE_YOUR_CALM;
    public static final n1 FLOW_CONTROL_ERROR;
    public static final n1 FRAME_SIZE_ERROR;
    public static final n1 HTTP_1_1_REQUIRED;
    public static final n1 INADEQUATE_SECURITY;
    public static final n1 INTERNAL_ERROR;
    public static final n1 NO_ERROR;
    public static final n1 PROTOCOL_ERROR;
    public static final n1 REFUSED_STREAM;
    public static final n1 SETTINGS_TIMEOUT;
    public static final n1 STREAM_CLOSED;
    private static final n1[] codeMap;
    private final int code;
    private final ecm.g2 status;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkArrayForEach(LoopRegionVisitor.java:227)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkForIndexedLoop(LoopRegionVisitor.java:141)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:78)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:62)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:55)
        */
    static {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gcm.n1.<clinit>():void");
    }

    public n1(String str, int i, int i2, ecm.g2 g2Var) {
        this.code = i2;
        String str2 = "HTTP/2 error code: " + name();
        this.status = g2Var.g(g2Var.f124810b != null ? v0.a.i(v0.a.l(str2, " ("), g2Var.f124810b, ")") : str2);
    }

    public static ecm.g2 a(long j2) {
        n1[] n1VarArr = codeMap;
        n1 n1Var = (j2 >= ((long) n1VarArr.length) || j2 < 0) ? null : n1VarArr[(int) j2];
        if (n1Var != null) {
            return n1Var.status;
        }
        return ecm.g2.c(INTERNAL_ERROR.status.f124809a.c()).g("Unrecognized HTTP/2 error code: " + j2);
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) $VALUES.clone();
    }
}
