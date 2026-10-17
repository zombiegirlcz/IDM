package g40;

import aw0.o9;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e BOT;

    @NotNull
    public static final d Companion;
    public static final e EXPERT;
    public static final e GURU;
    public static final e MODERATOR;
    public static final e ONBOARDING;
    public static final e SPECIALIST;
    private final dw0.a badge;
    private final int description;

    @NotNull
    private final Lazy descriptionClause$delegate = yhm.j.b(new fp3.a(this, 21));

    @NotNull
    private final String key;
    private final int title;

    @NotNull
    private final TextLocalisedClause titleClause;

    static {
        e eVar = new e("ONBOARDING", 0, "onboarding", R$string.chat_agent_bio_onboarding_title, R$string.chat_agent_bio_onboarding_description, null);
        ONBOARDING = eVar;
        e eVar2 = new e("SPECIALIST", 1, "specialist", R$string.chat_agent_bio_specialist_title, R$string.chat_agent_bio_specialist_description, null);
        SPECIALIST = eVar2;
        int i = R$string.chat_agent_bio_expert_title;
        int i2 = R$string.chat_agent_bio_expert_description;
        dw0.a aVar = dw0.a.Favourites;
        e eVar3 = new e("EXPERT", 2, "expert", i, i2, aVar);
        EXPERT = eVar3;
        e eVar4 = new e("MODERATOR", 3, "moderator", R$string.chat_agent_bio_moderator_title, R$string.chat_agent_bio_moderator_description, aVar);
        MODERATOR = eVar4;
        e eVar5 = new e("GURU", 4, "guru", R$string.chat_agent_bio_guru_title, R$string.chat_agent_bio_guru_description, aVar);
        GURU = eVar5;
        e eVar6 = new e("BOT", 5, "bot", R$string.chat_agent_bio_bot_title, R$string.chat_agent_bio_bot_description, aVar);
        BOT = eVar6;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
        Companion = new d();
    }

    public e(String str, int i, String str2, int i2, int i3, dw0.a aVar) {
        this.key = str2;
        this.title = i2;
        this.description = i3;
        this.badge = aVar;
        this.titleClause = new TextLocalisedClause(i2, null, null, 14);
    }

    public static Clause a(e eVar) {
        return eVar == BOT ? yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(eVar.description, null, null, 14), new TextLocalisedClause(R$string.chat_agent_chatbot_learn_more, null, new Click(30, (Integer) null, (Object) null, "BOT_LEARN_MORE_ACTION_ID", false), 10))) : new TextLocalisedClause(eVar.description, null, null, 14);
    }

    public static EnumEntries d() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final dw0.a b() {
        return this.badge;
    }

    public final Clause c() {
        return (Clause) this.descriptionClause$delegate.getValue();
    }

    public final String e() {
        return this.key;
    }

    public final TextLocalisedClause f() {
        return this.titleClause;
    }
}
