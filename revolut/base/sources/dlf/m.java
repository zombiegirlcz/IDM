package dlf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import elf.j2;
import java.util.List;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f115751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vlf.b f115752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f115753c;

    public m(h0 commonDataSource, vlf.b commonUiMapper, j2 userCommentClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(userCommentClickHandler, "userCommentClickHandler");
        this.f115751a = commonDataSource;
        this.f115752b = commonUiMapper;
        this.f115753c = userCommentClickHandler;
    }

    public static CellDetailsNoteDelegate.Model a(TextLocalisedClause textLocalisedClause, String str) {
        return new CellDetailsNoteDelegate.Model("ID_COMMENT", textLocalisedClause, null, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060);
    }
}
