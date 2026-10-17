package androidx.transition;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes16.dex */
public abstract class Scene {
    public static Scene getCurrentScene(ViewGroup viewGroup) {
        if (viewGroup.getTag(R$id.transition_current_scene) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    public static void setCurrentScene(ViewGroup viewGroup, Scene scene) {
        viewGroup.setTag(R$id.transition_current_scene, scene);
    }
}
