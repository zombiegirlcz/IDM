package q50;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends y50.d {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f01.a f242233m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wli.x f242234n;
    public final Lazy o;

    public j(f01.a uiKitResources, wli.x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f242233m = uiKitResources;
        this.f242234n = deeplinkHandler;
        this.o = yhm.j.b(new pyc.a(this, 15));
    }

    @Override // y50.d
    public final y50.a Z2() {
        return new g(this);
    }

    @Override // y50.d
    public final cli.g d3() {
        return (cli.g) this.o.getValue();
    }

    @Override // y50.d
    public final Object e3(String rawData) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        kg.o oVarA = w10.j.a();
        Type type = new TypeToken<e>() { // from class: com.revolut.chat.ui.messageslist.widgets.ChatLinkWidgetModel$parseInput$$inlined$fromJson$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Object objD = oVarA.d(rawData, type);
        Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
        return (e) objD;
    }
}
