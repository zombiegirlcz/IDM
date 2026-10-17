package jr0;

/* JADX INFO: loaded from: classes19.dex */
public interface i {
    default void Q() {
        getGlowHighlightManager().a();
    }

    default void X() {
        getGlowHighlightManager().d(null);
    }

    g getGlowHighlightManager();

    default void y() {
        getGlowHighlightManager().c();
    }
}
