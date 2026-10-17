package com.revolut.domain.models.transactions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b/\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00061"}, d2 = {"Lcom/revolut/domain/models/transactions/CategoryImage;", "", "", "isCustom", "<init>", "(Ljava/lang/String;IZ)V", "Z", "()Z", "Companion", "a", "COINS", "GROCERIES", "CART", "RESTAURANT", "TRANSPORT", "TRAVEL", "ENTERTAINMENT", "UTILITIES", "HEART", "SERVICES", "TRANSFERS", "CASH", "INSURANCE", "ENVELOPE", "VAULT", "INVEST", "GIFT", "FORM", "BASKETBALL", "COFFEE", "SCREEN", "FOOTBALL", "CYCLE", "SMILE", "SCISSORS", "ROCKET", "PHONE", "MAN", "INFINITY", "HEALTH", "HAT", "HAMBURGER", "FLAG", "DRINK", "DOG", "CHART", "CAR", "CAKE", "BULB", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CategoryImage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CategoryImage[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final boolean isCustom;
    public static final CategoryImage COINS = new CategoryImage("COINS", 0, true);
    public static final CategoryImage GROCERIES = new CategoryImage("GROCERIES", 1, true);
    public static final CategoryImage CART = new CategoryImage("CART", 2, true);
    public static final CategoryImage RESTAURANT = new CategoryImage("RESTAURANT", 3, true);
    public static final CategoryImage TRANSPORT = new CategoryImage("TRANSPORT", 4, true);
    public static final CategoryImage TRAVEL = new CategoryImage("TRAVEL", 5, true);
    public static final CategoryImage ENTERTAINMENT = new CategoryImage("ENTERTAINMENT", 6, true);
    public static final CategoryImage UTILITIES = new CategoryImage("UTILITIES", 7, true);
    public static final CategoryImage HEART = new CategoryImage("HEART", 8, true);
    public static final CategoryImage SERVICES = new CategoryImage("SERVICES", 9, true);
    public static final CategoryImage TRANSFERS = new CategoryImage("TRANSFERS", 10, true);
    public static final CategoryImage CASH = new CategoryImage("CASH", 11, true);
    public static final CategoryImage INSURANCE = new CategoryImage("INSURANCE", 12, true);
    public static final CategoryImage ENVELOPE = new CategoryImage("ENVELOPE", 13, true);
    public static final CategoryImage VAULT = new CategoryImage("VAULT", 14, true);
    public static final CategoryImage INVEST = new CategoryImage("INVEST", 15, true);
    public static final CategoryImage GIFT = new CategoryImage("GIFT", 16, true);
    public static final CategoryImage FORM = new CategoryImage("FORM", 17, true);
    public static final CategoryImage BASKETBALL = new CategoryImage("BASKETBALL", 18, true);
    public static final CategoryImage COFFEE = new CategoryImage("COFFEE", 19, true);
    public static final CategoryImage SCREEN = new CategoryImage("SCREEN", 20, false);
    public static final CategoryImage FOOTBALL = new CategoryImage("FOOTBALL", 21, false);
    public static final CategoryImage CYCLE = new CategoryImage("CYCLE", 22, false);
    public static final CategoryImage SMILE = new CategoryImage("SMILE", 23, false);
    public static final CategoryImage SCISSORS = new CategoryImage("SCISSORS", 24, false);
    public static final CategoryImage ROCKET = new CategoryImage("ROCKET", 25, false);
    public static final CategoryImage PHONE = new CategoryImage("PHONE", 26, false);
    public static final CategoryImage MAN = new CategoryImage("MAN", 27, false);
    public static final CategoryImage INFINITY = new CategoryImage("INFINITY", 28, false);
    public static final CategoryImage HEALTH = new CategoryImage("HEALTH", 29, false);
    public static final CategoryImage HAT = new CategoryImage("HAT", 30, false);
    public static final CategoryImage HAMBURGER = new CategoryImage("HAMBURGER", 31, false);
    public static final CategoryImage FLAG = new CategoryImage("FLAG", 32, false);
    public static final CategoryImage DRINK = new CategoryImage("DRINK", 33, false);
    public static final CategoryImage DOG = new CategoryImage("DOG", 34, false);
    public static final CategoryImage CHART = new CategoryImage("CHART", 35, false);
    public static final CategoryImage CAR = new CategoryImage("CAR", 36, false);
    public static final CategoryImage CAKE = new CategoryImage("CAKE", 37, false);
    public static final CategoryImage BULB = new CategoryImage("BULB", 38, false);

    /* JADX INFO: renamed from: com.revolut.domain.models.transactions.CategoryImage$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    private static final /* synthetic */ CategoryImage[] $values() {
        return new CategoryImage[]{COINS, GROCERIES, CART, RESTAURANT, TRANSPORT, TRAVEL, ENTERTAINMENT, UTILITIES, HEART, SERVICES, TRANSFERS, CASH, INSURANCE, ENVELOPE, VAULT, INVEST, GIFT, FORM, BASKETBALL, COFFEE, SCREEN, FOOTBALL, CYCLE, SMILE, SCISSORS, ROCKET, PHONE, MAN, INFINITY, HEALTH, HAT, HAMBURGER, FLAG, DRINK, DOG, CHART, CAR, CAKE, BULB};
    }

    static {
        CategoryImage[] categoryImageArr$values = $values();
        $VALUES = categoryImageArr$values;
        $ENTRIES = s.n(categoryImageArr$values);
        INSTANCE = new Companion();
    }

    private CategoryImage(String str, int i, boolean z) {
        this.isCustom = z;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CategoryImage valueOf(String str) {
        return (CategoryImage) Enum.valueOf(CategoryImage.class, str);
    }

    public static CategoryImage[] values() {
        return (CategoryImage[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: isCustom, reason: from getter */
    public final boolean getIsCustom() {
        return this.isCustom;
    }
}
