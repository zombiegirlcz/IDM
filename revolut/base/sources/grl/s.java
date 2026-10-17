package grl;

/* JADX INFO: loaded from: classes13.dex */
public enum s implements com.google.protobuf.a1 {
    view(0),
    screenshot(1),
    video_capture(2),
    search(3),
    settings(4),
    diagnostic(5),
    notification(6),
    disappear(7),
    impression(8),
    deeplink(9),
    intent(10),
    viewable_record(11),
    nudge(12),
    UNRECOGNIZED(-1);

    public static final int deeplink_VALUE = 9;
    public static final int diagnostic_VALUE = 5;
    public static final int disappear_VALUE = 7;
    public static final int impression_VALUE = 8;
    public static final int intent_VALUE = 10;
    private static final com.google.protobuf.b1 internalValueMap = new r();
    public static final int notification_VALUE = 6;
    public static final int nudge_VALUE = 12;
    public static final int screenshot_VALUE = 1;
    public static final int search_VALUE = 3;
    public static final int settings_VALUE = 4;
    public static final int video_capture_VALUE = 2;
    public static final int view_VALUE = 0;
    public static final int viewable_record_VALUE = 11;
    private final int value;

    s(int i) {
        this.value = i;
    }

    public static s a(int i) {
        switch (i) {
            case 0:
                return view;
            case 1:
                return screenshot;
            case 2:
                return video_capture;
            case 3:
                return search;
            case 4:
                return settings;
            case 5:
                return diagnostic;
            case 6:
                return notification;
            case 7:
                return disappear;
            case 8:
                return impression;
            case 9:
                return deeplink;
            case 10:
                return intent;
            case 11:
                return viewable_record;
            case 12:
                return nudge;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
