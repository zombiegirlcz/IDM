package uoj;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f281659b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f281660a;

    static {
        String[] elements = {"Africa/Blantyre", "Africa/Brazzaville", "Africa/Bujumbura", "Africa/Dar_es_Salaam", "Africa/Gaborone", "Africa/Harare", "Africa/Johannesburg", "Africa/Kigali", "Africa/Kinshasa", "Africa/Luanda", "Africa/Lubumbashi", "Africa/Lusaka", "Africa/Maputo", "Africa/Maseru", "Africa/Mbabane", "Africa/Nairobi", "Africa/Windhoek", "America/Araguaina", "America/Argentina/Buenos_Aires", "America/Argentina/Catamarca", "America/Argentina/Cordoba", "America/Argentina/Jujuy", "America/Argentina/La_Rioja", "America/Argentina/Mendoza", "America/Argentina/Rio_Gallegos", "America/Argentina/Salta", "America/Argentina/San_Juan", "America/Argentina/San_Luis", "America/Argentina/Tucuman", "America/Argentina/Ushuaia", "America/Asuncion", "America/Bahia", "America/Belem", "America/Campo_Grande", "America/Coyhaique", "America/Cuiaba", "America/Eirunepe", "America/Fortaleza", "America/Guayaquil", "America/La_Paz", "America/Lima", "America/Maceio", "America/Manaus", "America/Montevideo", "America/Noronha", "America/Porto_Velho", "America/Punta_Arenas", "America/Recife", "America/Rio_Branco", "America/Santarem", "America/Santiago", "America/Sao_Paulo", "Antarctica/Casey", "Antarctica/Davis", "Antarctica/DumontDUrville", "Antarctica/Macquarie", "Antarctica/Mawson", "Antarctica/McMurdo", "Antarctica/Palmer", "Antarctica/Rothera", "Antarctica/South_Pole", "Antarctica/Syowa", "Antarctica/Troll", "Antarctica/Vostok", "Asia/Dili", "Asia/Jakarta", "Asia/Jayapura", "Asia/Makassar", "Asia/Pontianak", "Atlantic/South_Georgia", "Atlantic/St_Helena", "Atlantic/Stanley", "Australia/Adelaide", "Australia/Brisbane", "Australia/Broken_Hill", "Australia/Currie", "Australia/Darwin", "Australia/Eucla", "Australia/Hobart", "Australia/Lindeman", "Australia/Lord_Howe", "Australia/Melbourne", "Australia/Perth", "Australia/Sydney", "Indian/Antananarivo", "Indian/Chagos", "Indian/Christmas", "Indian/Cocos", "Indian/Comoro", "Indian/Kerguelen", "Indian/Mahe", "Indian/Mauritius", "Indian/Mayotte", "Indian/Reunion", "Pacific/Apia", "Pacific/Auckland", "Pacific/Bougainville", "Pacific/Chatham", "Pacific/Easter", "Pacific/Efate", "Pacific/Enderbury", "Pacific/Fakaofo", "Pacific/Fiji", "Pacific/Funafuti", "Pacific/Galapagos", "Pacific/Gambier", "Pacific/Guadalcanal", "Pacific/Kanton", "Pacific/Marquesas", "Pacific/Nauru", "Pacific/Niue", "Pacific/Norfolk", "Pacific/Noumea", "Pacific/Pago_Pago", "Pacific/Pitcairn", "Pacific/Port_Moresby", "Pacific/Rarotonga", "Pacific/Tahiti", "Pacific/Tongatapu", "Pacific/Wallis"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f281659b = kotlin.collections.d.y0(elements);
    }

    public h(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f281660a = dateProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final uoj.e a() {
        /*
            r9 = this;
            l80.e r0 = r9.f281660a
            l80.f r0 = (l80.f) r0
            java.time.LocalDate r1 = r0.e()
            java.time.Month r2 = r1.getMonth()
            java.lang.String r3 = "getMonth(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.util.Set r4 = uoj.h.f281659b
            java.lang.String r0 = r0.a()
            boolean r0 = r4.contains(r0)
            int[] r4 = uoj.g.f281658a
            int r2 = r2.ordinal()
            r2 = r4[r2]
            switch(r2) {
                case 1: goto L44;
                case 2: goto L44;
                case 3: goto L44;
                case 4: goto L3c;
                case 5: goto L3c;
                case 6: goto L3c;
                case 7: goto L34;
                case 8: goto L34;
                case 9: goto L34;
                case 10: goto L2c;
                case 11: goto L2c;
                case 12: goto L2c;
                default: goto L26;
            }
        L26:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L2c:
            if (r0 == 0) goto L31
            uoj.a r0 = uoj.a.SUMMER
            goto L4b
        L31:
            uoj.a r0 = uoj.a.WINTER
            goto L4b
        L34:
            if (r0 == 0) goto L39
            uoj.a r0 = uoj.a.SPRING
            goto L4b
        L39:
            uoj.a r0 = uoj.a.AUTUMN
            goto L4b
        L3c:
            if (r0 == 0) goto L41
            uoj.a r0 = uoj.a.WINTER
            goto L4b
        L41:
            uoj.a r0 = uoj.a.SUMMER
            goto L4b
        L44:
            if (r0 == 0) goto L49
            uoj.a r0 = uoj.a.AUTUMN
            goto L4b
        L49:
            uoj.a r0 = uoj.a.SPRING
        L4b:
            uoj.e r2 = new uoj.e
            int r5 = r1.getYear()
            java.time.Month r6 = r1.getMonth()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            int r1 = r1.getDayOfMonth()
            uoj.a r3 = uoj.a.SPRING
            r7 = 0
            if (r0 == r3) goto L66
            uoj.a r3 = uoj.a.AUTUMN
            if (r0 == r3) goto L66
            goto L95
        L66:
            r3 = 2026(0x7ea, float:2.839E-42)
            r8 = 1
            if (r5 != r3) goto L7b
            java.time.Month r3 = java.time.Month.SEPTEMBER
            if (r6 != r3) goto L7b
            com.revolut.retail.common.ui.api.Toggles$SeasonalPasscodeGreeting r3 = com.revolut.retail.common.ui.api.Toggles.SeasonalPasscodeGreeting.f98587c
            r3 = 23
            if (r3 > r1) goto L95
            r3 = 30
            if (r1 >= r3) goto L95
        L79:
            r7 = r8
            goto L95
        L7b:
            int r3 = r6.ordinal()
            r3 = r4[r3]
            if (r3 == r8) goto L8e
            r4 = 4
            if (r3 == r4) goto L8e
            r4 = 7
            if (r3 == r4) goto L8e
            r4 = 10
            if (r3 == r4) goto L8e
            goto L95
        L8e:
            if (r8 > r1) goto L95
            r3 = 8
            if (r1 >= r3) goto L95
            goto L79
        L95:
            r2.<init>(r0, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: uoj.h.a():uoj.e");
    }
}
