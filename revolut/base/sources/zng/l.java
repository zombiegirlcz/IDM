package zng;

import android.os.Parcelable;
import android.text.InputFilter;
import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import cli.n;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.user_declarations.shared.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cog.a f323827a;

    public l(cog.a nameValidator) {
        Intrinsics.checkNotNullParameter(nameValidator, "nameValidator");
        this.f323827a = nameValidator;
    }

    public static InputTextDelegate.Model a(bog.b bVar) {
        String str = bVar.f9872b;
        String str2 = bVar.f17431c;
        if (str2 == null) {
            str2 = "";
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model(str, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.signup_alias_hint_required, null, null, 14), true, null, false, new TextLocalisedClause(R$string.common_word_optional, null, null, 14), null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, true, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -570425500, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static InputTextDelegate.Model b(l lVar, String str, String str2, Clause clause, List list, Clause clause2, boolean z, boolean z3, Integer num, Integer num2, int i, TextLocalisedClause textLocalisedClause, int i2) {
        Clause clause3 = (i2 & 16) != 0 ? null : clause2;
        boolean z4 = (i2 & 32) == 0;
        boolean z6 = (i2 & 128) != 0 ? false : z3;
        Integer num3 = (i2 & 256) != 0 ? null : num;
        Integer num4 = (i2 & 512) != 0 ? null : num2;
        String str3 = (i2 & 1024) != 0 ? "personGivenName" : "personFamilyName";
        int i3 = (i2 & 2048) != 0 ? R$attr.uikit_dp8 : i;
        InputTextDelegate.Model model = new InputTextDelegate.Model(str, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), clause, null, false, clause3, null, null, null, null, null, z6, num3, num4, z, false, 532720, 0, null, true, z4, str3, true, list, false, false, false, null, (i2 & 4096) != 0 ? null : textLocalisedClause, 0, -2116272264, 64511);
        yp0.b.l(model, i3, 0, 0, 0, null, false, 62);
        return model;
    }

    public static ListSubheaderDelegate.Model d(int i, String str) {
        return new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp32, R$attr.uikit_dp12, 0, 0, 53242);
    }

    public static List e() {
        InputFilter[] elements = {new a(), new InputFilter.LengthFilter(SyslogConstants.LOG_CLOCK)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 zng.h, still in use, count: 3, list:
          (r2v0 zng.h) from 0x0202: MOVE (r32v0 zng.h) = (r2v0 zng.h)
          (r2v0 zng.h) from 0x0182: MOVE (r32v2 zng.h) = (r2v0 zng.h)
          (r2v0 zng.h) from 0x00d5: MOVE (r32v4 zng.h) = (r2v0 zng.h)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // cli.n
    public final cli.o c(cli.j r36) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zng.l.c(cli.j):cli.o");
    }
}
