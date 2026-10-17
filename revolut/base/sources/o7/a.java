package o7;

/* JADX INFO: loaded from: classes16.dex */
public enum a {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");

    public final String extension;

    a(String str) {
        this.extension = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.extension;
    }
}
