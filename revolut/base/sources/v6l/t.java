package v6l;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Type f286502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Type f286503b;

    static {
        Type type = new TypeToken<List<? extends s6l.q>>() { // from class: com.revolut.shared.feature.cards.domain.impl.data.repository.CardRepositoryImplKt$LIST_OF_VIRTUAL_CARDS_ENTITIES_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f286502a = type;
        Type type2 = new TypeToken<List<? extends s6l.m>>() { // from class: com.revolut.shared.feature.cards.domain.impl.data.repository.CardRepositoryImplKt$LIST_OF_PHYSICAL_CARDS_ENTITIES_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        f286503b = type2;
    }
}
