package km2;

import java.util.Map;
import klf.w1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.y;

/* JADX INFO: loaded from: classes13.dex */
public final class r implements k {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk0.a f185705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mk0.a f185706b;

    static {
        Intrinsics.checkNotNullParameter("WALLPAPERS", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_LINES", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_CYBERPUNK", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_CYBERPUNK2", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_PREMIUM", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_ULTRA", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_PRIVATE", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_METAL", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_ZODIAC", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_HALLOWEEN", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_CHRISTMAS", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_GLASS", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_COLOURS", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_MINIMAL", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_PARTICLES", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_GLOW", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_PRIDE", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_BUSINESS", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_REVOLUT_X", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_SNAKE", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_LIGHTS", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_APEX", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_HORIZON", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_EXPLORE", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_CRYPTO", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_LAVA", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_UPBEAT", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_ALEX_KUZNETSOV", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_GEOMETRIC", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_DOGS", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_PSYCHEDELIC", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_VELVET", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_FLOWERS", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_YOUTH_GLOW", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_TRAVERTINE", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_UK_LANDSCAPES", "id");
        Intrinsics.checkNotNullParameter("WALLPAPERS_COMMON", "id");
    }

    public r(mk0.a personalisationStorage, mk0.a localPersonalisationStorage) {
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(localPersonalisationStorage, "localPersonalisationStorage");
        this.f185705a = personalisationStorage;
        this.f185706b = localPersonalisationStorage;
    }

    public final boolean a(j scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Map map = (Map) this.f185705a.a(new tk0.f(m.a(Companion, scope)));
        return !(map == null || map.isEmpty());
    }

    public final Flow b(j jVar) {
        String strA = m.a(Companion, jVar);
        tk0.f fVar = new tk0.f(strA);
        mk0.a aVar = this.f185705a;
        if (((Map) aVar.a(fVar)) != null) {
            return aVar.j(new tk0.f(strA));
        }
        return new y(new w1(), aVar.j(new tk0.f(strA)));
    }
}
