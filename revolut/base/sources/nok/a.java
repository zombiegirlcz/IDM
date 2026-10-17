package nok;

import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$ButtonStyle;
import mok.c;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f218065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f218066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f218067c;

    static {
        int[] iArr = new int[c.b.a.values().length];
        try {
            iArr[c.b.a.SHOW_BOTTOMSHEET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.b.a.OPEN_PLAN_INTRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.b.a.ACCEPT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c.b.a.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f218065a = iArr;
        int[] iArr2 = new int[c.EnumC1171c.values().length];
        try {
            iArr2[c.EnumC1171c.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[c.EnumC1171c.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f218066b = iArr2;
        int[] iArr3 = new int[PricingPlanWaitlistLayout$ButtonStyle.values().length];
        try {
            iArr3[PricingPlanWaitlistLayout$ButtonStyle.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[PricingPlanWaitlistLayout$ButtonStyle.SECONDARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f218067c = iArr3;
    }
}
