package et0;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.chat.ChatBubbleContainer;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 implements fu0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f129006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f129007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f129008c;
    public final Object d;
    public final Object e;
    public final Object f;

    public a0(Function0 enabledProvider, ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(enabledProvider, "enabledProvider");
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        int i = Build.VERSION.SDK_INT;
        oi0.c reorderNativeLibraryPaths = oi0.c.f;
        Intrinsics.checkNotNullParameter(enabledProvider, "enabledProvider");
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(reorderNativeLibraryPaths, "reorderNativeLibraryPaths");
        this.f129007b = classLoader;
        this.f129006a = i;
        this.f129008c = reorderNativeLibraryPaths;
        this.d = yhm.j.b(enabledProvider);
        this.e = new Object();
        this.f = new LinkedHashSet();
    }

    @Override // fu0.h
    public void B() {
        ChatBubbleContainer chatBubbleContainer = (ChatBubbleContainer) this.d;
        int i = chatBubbleContainer.f56798m;
        if (i != this.f129006a) {
            this.f129006a = i;
            Path path = (Path) this.f;
            path.reset();
            path.addRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, chatBubbleContainer.getWidth(), chatBubbleContainer.getHeight(), Path.Direction.CW);
            path.op(chatBubbleContainer.getChatShapeMask().a(), Path.Op.XOR);
            fu0.g gVar = (fu0.g) this.f129007b;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(path, "path");
            if (gVar.f138064b == 1) {
                gVar.f138063a.setEmpty();
                gVar.f138065c = BitmapDescriptorFactory.HUE_RED;
            }
            gVar.f138064b = 0;
            Path path2 = gVar.d;
            if (path2 == null) {
                path2 = new Path();
                gVar.d = path2;
            }
            path2.reset();
            path2.set(path);
            int i2 = gVar.e;
            int i3 = gVar.f;
            if (i2 == 0 || i3 == 0) {
                return;
            }
            path2.offset(i2, i3);
        }
    }

    @Override // fu0.h
    public fu0.g[] b() {
        return (fu0.g[]) this.e;
    }

    @Override // fu0.h
    public View getView() {
        return (ChatBubbleContainer) this.f129008c;
    }

    public a0(ChatBubbleContainer chatBubbleContainer) {
        this.d = chatBubbleContainer;
        fu0.g gVar = new fu0.g();
        this.f129007b = gVar;
        this.f129008c = chatBubbleContainer;
        this.e = new fu0.g[]{gVar};
        this.f = new Path();
    }
}
