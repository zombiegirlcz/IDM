package md;

/* JADX INFO: loaded from: classes17.dex */
public final class v1 extends com.google.crypto.tink.shaded.protobuf.b0 {
    private static final v1 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.a1 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.j value_ = com.google.crypto.tink.shaded.protobuf.j.f49370b;

    static {
        v1 v1Var = new v1();
        DEFAULT_INSTANCE = v1Var;
        com.google.crypto.tink.shaded.protobuf.b0.s(v1.class, v1Var);
    }

    public static t1 C() {
        return (t1) DEFAULT_INSTANCE.g();
    }

    public static void v(v1 v1Var, String str) {
        v1Var.getClass();
        str.getClass();
        v1Var.typeUrl_ = str;
    }

    public static void w(v1 v1Var, com.google.crypto.tink.shaded.protobuf.i iVar) {
        v1Var.getClass();
        v1Var.value_ = iVar;
    }

    public static void x(v1 v1Var, u1 u1Var) {
        v1Var.getClass();
        v1Var.keyMaterialType_ = u1Var.getNumber();
    }

    public static v1 y() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.typeUrl_;
    }

    public final com.google.crypto.tink.shaded.protobuf.j B() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object h(com.google.crypto.tink.shaded.protobuf.a0 a0Var) {
        com.google.crypto.tink.shaded.protobuf.a1 zVar;
        switch (s1.f204453a[a0Var.ordinal()]) {
            case 1:
                return new v1();
            case 2:
                return new t1(DEFAULT_INSTANCE);
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.f1(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.crypto.tink.shaded.protobuf.a1 a1Var = PARSER;
                if (a1Var != null) {
                    return a1Var;
                }
                synchronized (v1.class) {
                    try {
                        zVar = PARSER;
                        if (zVar == null) {
                            zVar = new com.google.crypto.tink.shaded.protobuf.z();
                            PARSER = zVar;
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                    break;
                }
                return zVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final u1 z() {
        int i = this.keyMaterialType_;
        u1 u1Var = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : u1.REMOTE : u1.ASYMMETRIC_PUBLIC : u1.ASYMMETRIC_PRIVATE : u1.SYMMETRIC : u1.UNKNOWN_KEYMATERIAL;
        return u1Var == null ? u1.UNRECOGNIZED : u1Var;
    }
}
