package q35;

/* JADX INFO: loaded from: classes21.dex */
public interface o extends r {
    a getState();

    @Override // q35.r
    default boolean isEnabled() {
        return getState() == a.Active;
    }
}
