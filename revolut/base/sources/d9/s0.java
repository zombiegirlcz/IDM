package d9;

/* JADX INFO: loaded from: classes16.dex */
public enum s0 {
    NONE(null),
    CLASS("@class"),
    MINIMAL_CLASS("@c"),
    NAME("@type"),
    DEDUCTION(null),
    CUSTOM(null);

    private final String _defaultPropertyName;

    s0(String str) {
        this._defaultPropertyName = str;
    }

    public final String a() {
        return this._defaultPropertyName;
    }
}
