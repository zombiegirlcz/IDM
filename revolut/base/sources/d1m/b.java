package d1m;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public enum b {
    Single(1),
    SmallGroup(10),
    LargeGroup(25);


    @NotNull
    public static final a Companion = new a();
    private final int code;

    b(int i) {
        this.code = i;
    }

    public final int a() {
        return this.code;
    }
}
