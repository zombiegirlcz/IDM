package x5k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class s {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f303000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f303001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayeredImage f303002c;
    public final List d;
    public final String e;

    public s(TextLocalisedClause textLocalisedClause, Clause clause, LayeredImage layeredImage, String str) {
        f0 f0Var = f0.f322471a;
        this.f303000a = textLocalisedClause;
        this.f303001b = clause;
        this.f303002c = layeredImage;
        this.d = f0Var;
        this.e = str;
    }
}
