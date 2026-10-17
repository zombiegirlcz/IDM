package tmm;

/* JADX INFO: loaded from: classes14.dex */
public enum d {
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");

    private final String lineSeparator;

    d(String str) {
        this.lineSeparator = str;
    }
}
