package i1m;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public enum b {
    Web("web"),
    Mobile("mob"),
    Desktop("pc"),
    ServerSideApp("srv"),
    General("app"),
    ConnectedTV("tv"),
    GameConsole("cnsl"),
    InternetOfThings("iot");


    @NotNull
    public static final a Companion = new a();

    @NotNull
    private final String value;

    b(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }
}
