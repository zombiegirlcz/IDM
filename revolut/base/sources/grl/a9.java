package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum a9 implements com.google.protobuf.a1 {
    Invite(0),
    CopyLink(1),
    WhatsApp(2),
    Messenger(3),
    More(4),
    UNRECOGNIZED(-1);

    public static final int CopyLink_VALUE = 1;
    public static final int Invite_VALUE = 0;
    public static final int Messenger_VALUE = 3;
    public static final int More_VALUE = 4;
    public static final int WhatsApp_VALUE = 2;
    private static final com.google.protobuf.b1 internalValueMap = new z8();
    private final int value;

    a9(int i) {
        this.value = i;
    }

    public static a9 a(int i) {
        if (i == 0) {
            return Invite;
        }
        if (i == 1) {
            return CopyLink;
        }
        if (i == 2) {
            return WhatsApp;
        }
        if (i == 3) {
            return Messenger;
        }
        if (i != 4) {
            return null;
        }
        return More;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
