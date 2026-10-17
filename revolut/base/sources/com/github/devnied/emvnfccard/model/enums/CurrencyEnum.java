package com.github.devnied.emvnfccard.model.enums;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.google.android.gms.wallet.WalletConstants;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.youTransactor.uCube.rpc.Constants;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AED' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes16.dex */
public final class CurrencyEnum implements IKeyEnum {
    private static final /* synthetic */ CurrencyEnum[] $VALUES;
    public static final CurrencyEnum AED;
    public static final CurrencyEnum AFN;
    public static final CurrencyEnum ALL;
    public static final CurrencyEnum AMD;
    public static final CurrencyEnum ANG;
    public static final CurrencyEnum AOA;
    public static final CurrencyEnum ARS;
    public static final CurrencyEnum AUD;
    public static final CurrencyEnum AWG;
    public static final CurrencyEnum AZN;
    public static final CurrencyEnum BAM;
    public static final CurrencyEnum BBD;
    public static final CurrencyEnum BDT;
    public static final CurrencyEnum BGN;
    public static final CurrencyEnum BHD;
    public static final CurrencyEnum BIF;
    public static final CurrencyEnum BMD;
    public static final CurrencyEnum BND;
    public static final CurrencyEnum BOB;
    public static final CurrencyEnum BOV;
    public static final CurrencyEnum BRL;
    public static final CurrencyEnum BSD;
    public static final CurrencyEnum BTN;
    public static final CurrencyEnum BWP;
    public static final CurrencyEnum BYR;
    public static final CurrencyEnum BZD;
    public static final CurrencyEnum CAD;
    public static final CurrencyEnum CDF;
    public static final CurrencyEnum CHE;
    public static final CurrencyEnum CHF;
    public static final CurrencyEnum CHW;
    public static final CurrencyEnum CLF;
    public static final CurrencyEnum CLP;
    public static final CurrencyEnum CNY;
    public static final CurrencyEnum COP;
    public static final CurrencyEnum COU;
    public static final CurrencyEnum CRC;
    public static final CurrencyEnum CUC;
    public static final CurrencyEnum CUP;
    public static final CurrencyEnum CVE;
    public static final CurrencyEnum CZK;
    public static final CurrencyEnum DJF;
    public static final CurrencyEnum DKK;
    public static final CurrencyEnum DOP;
    public static final CurrencyEnum DZD;
    public static final CurrencyEnum EGP;
    public static final CurrencyEnum ERN;
    public static final CurrencyEnum ETB;
    public static final CurrencyEnum EUR;
    public static final CurrencyEnum FJD;
    public static final CurrencyEnum FKP;
    public static final CurrencyEnum GBP;
    public static final CurrencyEnum GEL;
    public static final CurrencyEnum GHS;
    public static final CurrencyEnum GIP;
    public static final CurrencyEnum GMD;
    public static final CurrencyEnum GNF;
    public static final CurrencyEnum GTQ;
    public static final CurrencyEnum GYD;
    public static final CurrencyEnum HKD;
    public static final CurrencyEnum HNL;
    public static final CurrencyEnum HRK;
    public static final CurrencyEnum HTG;
    public static final CurrencyEnum HUF;
    public static final CurrencyEnum IDR;
    public static final CurrencyEnum ILS;
    public static final CurrencyEnum INR;
    public static final CurrencyEnum IQD;
    public static final CurrencyEnum IRR;
    public static final CurrencyEnum ISK;
    public static final CurrencyEnum JMD;
    public static final CurrencyEnum JOD;
    public static final CurrencyEnum JPY;
    public static final CurrencyEnum KES;
    public static final CurrencyEnum KGS;
    public static final CurrencyEnum KHR;
    public static final CurrencyEnum KMF;
    public static final CurrencyEnum KPW;
    public static final CurrencyEnum KRW;
    public static final CurrencyEnum KWD;
    public static final CurrencyEnum KYD;
    public static final CurrencyEnum KZT;
    public static final CurrencyEnum LAK;
    public static final CurrencyEnum LBP;
    public static final CurrencyEnum LKR;
    public static final CurrencyEnum LRD;
    public static final CurrencyEnum LSL;
    public static final CurrencyEnum LTL;
    public static final CurrencyEnum LVL;
    public static final CurrencyEnum LYD;
    public static final CurrencyEnum MAD;
    public static final CurrencyEnum MDL;
    public static final CurrencyEnum MGA;
    public static final CurrencyEnum MKD;
    public static final CurrencyEnum MMK;
    public static final CurrencyEnum MNT;
    public static final CurrencyEnum MOP;
    public static final CurrencyEnum MRO;
    public static final CurrencyEnum MUR;
    public static final CurrencyEnum MVR;
    public static final CurrencyEnum MWK;
    public static final CurrencyEnum MXN;
    public static final CurrencyEnum MXV;
    public static final CurrencyEnum MYR;
    public static final CurrencyEnum MZN;
    public static final CurrencyEnum NAD;
    public static final CurrencyEnum NGN;
    public static final CurrencyEnum NIO;
    public static final CurrencyEnum NOK;
    public static final CurrencyEnum NPR;
    public static final CurrencyEnum NZD;
    public static final CurrencyEnum OMR;
    public static final CurrencyEnum PAB;
    public static final CurrencyEnum PEN;
    public static final CurrencyEnum PGK;
    public static final CurrencyEnum PHP;
    public static final CurrencyEnum PKR;
    public static final CurrencyEnum PLN;
    public static final CurrencyEnum PYG;
    public static final CurrencyEnum QAR;
    public static final CurrencyEnum RON;
    public static final CurrencyEnum RSD;
    public static final CurrencyEnum RUB;
    public static final CurrencyEnum RWF;
    public static final CurrencyEnum SAR;
    public static final CurrencyEnum SBD;
    public static final CurrencyEnum SCR;
    public static final CurrencyEnum SDG;
    public static final CurrencyEnum SEK;
    public static final CurrencyEnum SGD;
    public static final CurrencyEnum SHP;
    public static final CurrencyEnum SLL;
    public static final CurrencyEnum SOS;
    public static final CurrencyEnum SRD;
    public static final CurrencyEnum SSP;
    public static final CurrencyEnum STD;
    public static final CurrencyEnum SYP;
    public static final CurrencyEnum SZL;
    public static final CurrencyEnum THB;
    public static final CurrencyEnum TJS;
    public static final CurrencyEnum TMT;
    public static final CurrencyEnum TND;
    public static final CurrencyEnum TOP;
    public static final CurrencyEnum TRY;
    public static final CurrencyEnum TTD;
    public static final CurrencyEnum TWD;
    public static final CurrencyEnum TZS;
    public static final CurrencyEnum UAH;
    public static final CurrencyEnum UGX;
    public static final CurrencyEnum USD;
    public static final CurrencyEnum USN;
    public static final CurrencyEnum USS;
    public static final CurrencyEnum UYI;
    public static final CurrencyEnum UYU;
    public static final CurrencyEnum UZS;
    public static final CurrencyEnum VEF;
    public static final CurrencyEnum VND;
    public static final CurrencyEnum VUV;
    public static final CurrencyEnum WST;
    public static final CurrencyEnum XAF;
    public static final CurrencyEnum XAG;
    public static final CurrencyEnum XAU;
    public static final CurrencyEnum XBA;
    public static final CurrencyEnum XBB;
    public static final CurrencyEnum XBC;
    public static final CurrencyEnum XBD;
    public static final CurrencyEnum XCD;
    public static final CurrencyEnum XDR;
    public static final CurrencyEnum XFU;
    public static final CurrencyEnum XOF;
    public static final CurrencyEnum XPD;
    public static final CurrencyEnum XPF;
    public static final CurrencyEnum XPT;
    public static final CurrencyEnum XTS;
    public static final CurrencyEnum XXX;
    public static final CurrencyEnum YER;
    public static final CurrencyEnum ZAR;
    public static final CurrencyEnum ZMK;
    private final String code = name().toUpperCase();
    private final CountryCodeEnum[] countries;
    private final Digits digits;
    private final String name;
    private final int numeric;

    /* JADX INFO: renamed from: com.github.devnied.emvnfccard.model.enums.CurrencyEnum$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$devnied$emvnfccard$model$enums$CountryCodeEnum;
        static final /* synthetic */ int[] $SwitchMap$com$github$devnied$emvnfccard$model$enums$CurrencyEnum$Digits;

        static {
            int[] iArr = new int[CountryCodeEnum.values().length];
            $SwitchMap$com$github$devnied$emvnfccard$model$enums$CountryCodeEnum = iArr;
            try {
                iArr[CountryCodeEnum.BO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$devnied$emvnfccard$model$enums$CountryCodeEnum[CountryCodeEnum.CH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$github$devnied$emvnfccard$model$enums$CountryCodeEnum[CountryCodeEnum.CL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$devnied$emvnfccard$model$enums$CountryCodeEnum[CountryCodeEnum.MX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$devnied$emvnfccard$model$enums$CountryCodeEnum[CountryCodeEnum.US.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$github$devnied$emvnfccard$model$enums$CountryCodeEnum[CountryCodeEnum.UY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[Digits.values().length];
            $SwitchMap$com$github$devnied$emvnfccard$model$enums$CurrencyEnum$Digits = iArr2;
            try {
                iArr2[Digits.DIGITS_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$github$devnied$emvnfccard$model$enums$CurrencyEnum$Digits[Digits.DIGITS_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$github$devnied$emvnfccard$model$enums$CurrencyEnum$Digits[Digits.DIGITS_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$github$devnied$emvnfccard$model$enums$CurrencyEnum$Digits[Digits.DIGITS_07.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$github$devnied$emvnfccard$model$enums$CurrencyEnum$Digits[Digits.DIGITS_NO.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public enum Digits {
        DIGITS_0,
        DIGITS_2,
        DIGITS_3,
        DIGITS_07,
        DIGITS_NO
    }

    static {
        Digits digits = Digits.DIGITS_2;
        CurrencyEnum currencyEnum = new CurrencyEnum("AED", 0, 784, digits, "United Arab Emirates dirham", new CountryCodeEnum[]{CountryCodeEnum.AE});
        AED = currencyEnum;
        CurrencyEnum currencyEnum2 = new CurrencyEnum("AFN", 1, 971, digits, "Afghan afghani", new CountryCodeEnum[]{CountryCodeEnum.AF});
        AFN = currencyEnum2;
        CurrencyEnum currencyEnum3 = new CurrencyEnum("ALL", 2, 8, digits, "Albanian lek", new CountryCodeEnum[]{CountryCodeEnum.AL});
        ALL = currencyEnum3;
        CurrencyEnum currencyEnum4 = new CurrencyEnum("AMD", 3, 51, digits, "Armenian dram", new CountryCodeEnum[]{CountryCodeEnum.AM});
        AMD = currencyEnum4;
        CurrencyEnum currencyEnum5 = new CurrencyEnum("ANG", 4, 532, digits, "Netherlands Antillean guilder", new CountryCodeEnum[]{CountryCodeEnum.CW, CountryCodeEnum.SX});
        ANG = currencyEnum5;
        CurrencyEnum currencyEnum6 = new CurrencyEnum("AOA", 5, 973, digits, "Angolan kwanza", new CountryCodeEnum[]{CountryCodeEnum.AO});
        AOA = currencyEnum6;
        CurrencyEnum currencyEnum7 = new CurrencyEnum("ARS", 6, 32, digits, "Argentine peso", new CountryCodeEnum[]{CountryCodeEnum.AR});
        ARS = currencyEnum7;
        CurrencyEnum currencyEnum8 = new CurrencyEnum("AUD", 7, 36, digits, "Australian dollar", new CountryCodeEnum[]{CountryCodeEnum.AU, CountryCodeEnum.CX, CountryCodeEnum.CC, CountryCodeEnum.HM, CountryCodeEnum.KI, CountryCodeEnum.NR, CountryCodeEnum.NF, CountryCodeEnum.TV});
        AUD = currencyEnum8;
        CurrencyEnum currencyEnum9 = new CurrencyEnum("AWG", 8, 533, digits, "Aruban florin", new CountryCodeEnum[]{CountryCodeEnum.AW});
        AWG = currencyEnum9;
        CurrencyEnum currencyEnum10 = new CurrencyEnum("AZN", 9, 944, digits, "Azerbaijani manat", new CountryCodeEnum[]{CountryCodeEnum.AZ});
        AZN = currencyEnum10;
        CurrencyEnum currencyEnum11 = new CurrencyEnum("BAM", 10, 977, digits, "Bosnia and Herzegovina convertible mark", new CountryCodeEnum[]{CountryCodeEnum.BA});
        BAM = currencyEnum11;
        CountryCodeEnum countryCodeEnum = CountryCodeEnum.BB;
        CurrencyEnum currencyEnum12 = new CurrencyEnum("BBD", 11, 52, digits, "Barbados dollar", new CountryCodeEnum[]{countryCodeEnum});
        BBD = currencyEnum12;
        CurrencyEnum currencyEnum13 = new CurrencyEnum("BDT", 12, 50, digits, "Bangladeshi taka", new CountryCodeEnum[]{CountryCodeEnum.BD});
        BDT = currencyEnum13;
        CurrencyEnum currencyEnum14 = new CurrencyEnum("BGN", 13, 975, digits, "Bulgarian lev", new CountryCodeEnum[]{CountryCodeEnum.BG});
        BGN = currencyEnum14;
        Digits digits2 = Digits.DIGITS_3;
        CurrencyEnum currencyEnum15 = new CurrencyEnum("BHD", 14, 48, digits2, "Bahraini dinar", new CountryCodeEnum[]{CountryCodeEnum.BH});
        BHD = currencyEnum15;
        Digits digits3 = Digits.DIGITS_0;
        CurrencyEnum currencyEnum16 = new CurrencyEnum("BIF", 15, LDSFile.EF_DG12_TAG, digits3, "Burundian franc", new CountryCodeEnum[]{CountryCodeEnum.BI});
        BIF = currencyEnum16;
        CountryCodeEnum countryCodeEnum2 = CountryCodeEnum.BM;
        CurrencyEnum currencyEnum17 = new CurrencyEnum("BMD", 16, 60, digits, "Bermudian dollar", new CountryCodeEnum[]{countryCodeEnum2});
        BMD = currencyEnum17;
        CountryCodeEnum countryCodeEnum3 = CountryCodeEnum.BN;
        CountryCodeEnum countryCodeEnum4 = CountryCodeEnum.SG;
        CurrencyEnum currencyEnum18 = new CurrencyEnum("BND", 17, 96, digits, "Brunei dollar", new CountryCodeEnum[]{countryCodeEnum3, countryCodeEnum4});
        BND = currencyEnum18;
        CountryCodeEnum countryCodeEnum5 = CountryCodeEnum.BO;
        CurrencyEnum currencyEnum19 = new CurrencyEnum("BOB", 18, 68, digits, "Boliviano", new CountryCodeEnum[]{countryCodeEnum5});
        BOB = currencyEnum19;
        CurrencyEnum currencyEnum20 = new CurrencyEnum("BOV", 19, 984, digits, "Bolivian Mvdol (funds code)", new CountryCodeEnum[]{countryCodeEnum5});
        BOV = currencyEnum20;
        CurrencyEnum currencyEnum21 = new CurrencyEnum("BRL", 20, 986, digits, "Brazilian real", new CountryCodeEnum[]{CountryCodeEnum.BR});
        BRL = currencyEnum21;
        CurrencyEnum currencyEnum22 = new CurrencyEnum("BSD", 21, 44, digits, "Bahamian dollar", new CountryCodeEnum[]{CountryCodeEnum.BS});
        BSD = currencyEnum22;
        CurrencyEnum currencyEnum23 = new CurrencyEnum("BTN", 22, 64, digits, "Bhutanese ngultrum", new CountryCodeEnum[]{CountryCodeEnum.BT});
        BTN = currencyEnum23;
        CurrencyEnum currencyEnum24 = new CurrencyEnum("BWP", 23, 72, digits, "Botswana pula", new CountryCodeEnum[]{CountryCodeEnum.BW});
        BWP = currencyEnum24;
        CurrencyEnum currencyEnum25 = new CurrencyEnum("BYR", 24, 974, digits3, "Belarusian ruble", new CountryCodeEnum[]{CountryCodeEnum.BY});
        BYR = currencyEnum25;
        CurrencyEnum currencyEnum26 = new CurrencyEnum("BZD", 25, 84, digits, "Belize dollar", new CountryCodeEnum[]{CountryCodeEnum.BZ});
        BZD = currencyEnum26;
        CurrencyEnum currencyEnum27 = new CurrencyEnum("CAD", 26, 124, digits, "Canadian dollar", new CountryCodeEnum[]{CountryCodeEnum.CA});
        CAD = currencyEnum27;
        CountryCodeEnum countryCodeEnum6 = CountryCodeEnum.CD;
        CurrencyEnum currencyEnum28 = new CurrencyEnum("CDF", 27, 976, digits, "Congolese franc", new CountryCodeEnum[]{countryCodeEnum6});
        CDF = currencyEnum28;
        CountryCodeEnum countryCodeEnum7 = CountryCodeEnum.CH;
        CurrencyEnum currencyEnum29 = new CurrencyEnum("CHE", 28, 947, digits, "WIR Euro (complementary currency)", new CountryCodeEnum[]{countryCodeEnum7});
        CHE = currencyEnum29;
        CurrencyEnum currencyEnum30 = new CurrencyEnum("CHF", 29, 756, digits, "Swiss franc", new CountryCodeEnum[]{countryCodeEnum7, CountryCodeEnum.LI});
        CHF = currencyEnum30;
        CurrencyEnum currencyEnum31 = new CurrencyEnum("CHW", 30, 948, digits, "WIR Franc (complementary currency)", new CountryCodeEnum[]{countryCodeEnum7});
        CHW = currencyEnum31;
        CountryCodeEnum countryCodeEnum8 = CountryCodeEnum.CL;
        CurrencyEnum currencyEnum32 = new CurrencyEnum("CLF", 31, 990, digits3, "Unidad de Fomento (funds code)", new CountryCodeEnum[]{countryCodeEnum8});
        CLF = currencyEnum32;
        CurrencyEnum currencyEnum33 = new CurrencyEnum("CLP", 32, SyslogConstants.LOG_LOCAL3, digits3, "Chilean peso", new CountryCodeEnum[]{countryCodeEnum8});
        CLP = currencyEnum33;
        CurrencyEnum currencyEnum34 = new CurrencyEnum("CNY", 33, Constants.EMVTag.TAG_9C_TRANSACTION_TYPE, digits, "Chinese yuan", new CountryCodeEnum[]{CountryCodeEnum.CN});
        CNY = currencyEnum34;
        CountryCodeEnum countryCodeEnum9 = CountryCodeEnum.CO;
        CurrencyEnum currencyEnum35 = new CurrencyEnum("COP", 34, 170, digits, "Colombian peso", new CountryCodeEnum[]{countryCodeEnum9});
        COP = currencyEnum35;
        CurrencyEnum currencyEnum36 = new CurrencyEnum("COU", 35, 970, digits, "Unidad de Valor Real", new CountryCodeEnum[]{countryCodeEnum9});
        COU = currencyEnum36;
        CurrencyEnum currencyEnum37 = new CurrencyEnum("CRC", 36, 188, digits, "Costa Rican colon", new CountryCodeEnum[]{CountryCodeEnum.CR});
        CRC = currencyEnum37;
        CountryCodeEnum countryCodeEnum10 = CountryCodeEnum.CU;
        CurrencyEnum currencyEnum38 = new CurrencyEnum("CUC", 37, 931, digits, "Cuban convertible peso", new CountryCodeEnum[]{countryCodeEnum10});
        CUC = currencyEnum38;
        CurrencyEnum currencyEnum39 = new CurrencyEnum("CUP", 38, 192, digits, "Cuban peso", new CountryCodeEnum[]{countryCodeEnum10});
        CUP = currencyEnum39;
        CurrencyEnum currencyEnum40 = new CurrencyEnum("CVE", 39, 132, digits3, "Cape Verde escudo", new CountryCodeEnum[]{CountryCodeEnum.CV});
        CVE = currencyEnum40;
        CurrencyEnum currencyEnum41 = new CurrencyEnum("CZK", 40, Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_1, digits, "Czech koruna", new CountryCodeEnum[]{CountryCodeEnum.CZ});
        CZK = currencyEnum41;
        CurrencyEnum currencyEnum42 = new CurrencyEnum("DJF", 41, 262, digits3, "Djiboutian franc", new CountryCodeEnum[]{CountryCodeEnum.DJ});
        DJF = currencyEnum42;
        CurrencyEnum currencyEnum43 = new CurrencyEnum("DKK", 42, 208, digits, "Danish krone", new CountryCodeEnum[]{CountryCodeEnum.DK, CountryCodeEnum.FO, CountryCodeEnum.GL});
        DKK = currencyEnum43;
        CurrencyEnum currencyEnum44 = new CurrencyEnum("DOP", 43, Constants.TAG_EMV_L1_CHECKSUM, digits, "Dominican peso", new CountryCodeEnum[]{CountryCodeEnum.DO});
        DOP = currencyEnum44;
        CurrencyEnum currencyEnum45 = new CurrencyEnum("DZD", 44, 12, digits, "Algerian dinar", new CountryCodeEnum[]{CountryCodeEnum.DZ});
        DZD = currencyEnum45;
        CurrencyEnum currencyEnum46 = new CurrencyEnum("EGP", 45, 818, digits, "Egyptian pound", new CountryCodeEnum[]{CountryCodeEnum.EG});
        EGP = currencyEnum46;
        CurrencyEnum currencyEnum47 = new CurrencyEnum("ERN", 46, 232, digits, "Eritrean nakfa", new CountryCodeEnum[]{CountryCodeEnum.ER});
        ERN = currencyEnum47;
        CurrencyEnum currencyEnum48 = new CurrencyEnum("ETB", 47, 230, digits, "Ethiopian birr", new CountryCodeEnum[]{CountryCodeEnum.ET});
        ETB = currencyEnum48;
        CurrencyEnum currencyEnum49 = new CurrencyEnum("EUR", 48, 978, digits, "Euro", new CountryCodeEnum[]{CountryCodeEnum.AD, CountryCodeEnum.AT, CountryCodeEnum.BE, CountryCodeEnum.CY, CountryCodeEnum.EE, CountryCodeEnum.FI, CountryCodeEnum.FR, CountryCodeEnum.DE, CountryCodeEnum.GR, CountryCodeEnum.IE, CountryCodeEnum.IT, CountryCodeEnum.LU, CountryCodeEnum.MT, CountryCodeEnum.MC, CountryCodeEnum.ME, CountryCodeEnum.NL, CountryCodeEnum.PT, CountryCodeEnum.SM, CountryCodeEnum.SK, CountryCodeEnum.SI, CountryCodeEnum.ES, CountryCodeEnum.VA});
        EUR = currencyEnum49;
        CurrencyEnum currencyEnum50 = new CurrencyEnum("FJD", 49, 242, digits, "Fiji dollar", new CountryCodeEnum[]{CountryCodeEnum.FJ});
        FJD = currencyEnum50;
        CurrencyEnum currencyEnum51 = new CurrencyEnum("FKP", 50, Constants.TAG_EE_SUPPORTED_RPC_ID_LIST, digits, "Falkland Islands pound", new CountryCodeEnum[]{CountryCodeEnum.FK});
        FKP = currencyEnum51;
        CountryCodeEnum countryCodeEnum11 = CountryCodeEnum.GB;
        CountryCodeEnum countryCodeEnum12 = CountryCodeEnum.IM;
        CountryCodeEnum countryCodeEnum13 = CountryCodeEnum.GS;
        CountryCodeEnum countryCodeEnum14 = CountryCodeEnum.IO;
        CurrencyEnum currencyEnum52 = new CurrencyEnum("GBP", 51, 826, digits, "Pound sterling", new CountryCodeEnum[]{countryCodeEnum11, countryCodeEnum12, countryCodeEnum13, countryCodeEnum14});
        GBP = currencyEnum52;
        CurrencyEnum currencyEnum53 = new CurrencyEnum("GEL", 52, 981, digits, "Georgian lari", new CountryCodeEnum[]{CountryCodeEnum.GE});
        GEL = currencyEnum53;
        CurrencyEnum currencyEnum54 = new CurrencyEnum("GHS", 53, 936, digits, "Ghanaian cedi", new CountryCodeEnum[]{CountryCodeEnum.GH});
        GHS = currencyEnum54;
        CurrencyEnum currencyEnum55 = new CurrencyEnum("GIP", 54, 292, digits, "Gibraltar pound", new CountryCodeEnum[]{CountryCodeEnum.GI});
        GIP = currencyEnum55;
        CurrencyEnum currencyEnum56 = new CurrencyEnum("GMD", 55, 270, digits, "Gambian dalasi", new CountryCodeEnum[]{CountryCodeEnum.GM});
        GMD = currencyEnum56;
        CurrencyEnum currencyEnum57 = new CurrencyEnum("GNF", 56, 324, digits3, "Guinean franc", new CountryCodeEnum[]{CountryCodeEnum.GN});
        GNF = currencyEnum57;
        CurrencyEnum currencyEnum58 = new CurrencyEnum("GTQ", 57, 320, digits, "Guatemalan quetzal", new CountryCodeEnum[]{CountryCodeEnum.GT});
        GTQ = currencyEnum58;
        CurrencyEnum currencyEnum59 = new CurrencyEnum("GYD", 58, 328, digits, "Guyanese dollar", new CountryCodeEnum[]{CountryCodeEnum.GY});
        GYD = currencyEnum59;
        CountryCodeEnum countryCodeEnum15 = CountryCodeEnum.HK;
        CountryCodeEnum countryCodeEnum16 = CountryCodeEnum.MO;
        CurrencyEnum currencyEnum60 = new CurrencyEnum("HKD", 59, 344, digits, "Hong Kong dollar", new CountryCodeEnum[]{countryCodeEnum15, countryCodeEnum16});
        HKD = currencyEnum60;
        CurrencyEnum currencyEnum61 = new CurrencyEnum("HNL", 60, 340, digits, "Honduran lempira", new CountryCodeEnum[]{CountryCodeEnum.HN});
        HNL = currencyEnum61;
        CurrencyEnum currencyEnum62 = new CurrencyEnum("HRK", 61, 191, digits, "Croatian kuna", new CountryCodeEnum[]{CountryCodeEnum.HR});
        HRK = currencyEnum62;
        CountryCodeEnum countryCodeEnum17 = CountryCodeEnum.HT;
        CurrencyEnum currencyEnum63 = new CurrencyEnum("HTG", 62, 332, digits, "Haitian gourde", new CountryCodeEnum[]{countryCodeEnum17});
        HTG = currencyEnum63;
        CurrencyEnum currencyEnum64 = new CurrencyEnum("HUF", 63, 348, digits, "Hungarian forint", new CountryCodeEnum[]{CountryCodeEnum.HU});
        HUF = currencyEnum64;
        CurrencyEnum currencyEnum65 = new CurrencyEnum("IDR", 64, 360, digits, "Indonesian rupiah", new CountryCodeEnum[]{CountryCodeEnum.ID});
        IDR = currencyEnum65;
        CurrencyEnum currencyEnum66 = new CurrencyEnum("ILS", 65, 376, digits, "Israeli new shekel", new CountryCodeEnum[]{CountryCodeEnum.IL, CountryCodeEnum.PS});
        ILS = currencyEnum66;
        CurrencyEnum currencyEnum67 = new CurrencyEnum("INR", 66, 356, digits, "Indian rupee", new CountryCodeEnum[]{CountryCodeEnum.IN});
        INR = currencyEnum67;
        CurrencyEnum currencyEnum68 = new CurrencyEnum("IQD", 67, 368, digits2, "Iraqi dinar", new CountryCodeEnum[]{CountryCodeEnum.IQ});
        IQD = currencyEnum68;
        CurrencyEnum currencyEnum69 = new CurrencyEnum("IRR", 68, 364, digits3, "Iranian rial", new CountryCodeEnum[]{CountryCodeEnum.IR});
        IRR = currencyEnum69;
        CurrencyEnum currencyEnum70 = new CurrencyEnum("ISK", 69, 352, digits3, "Icelandic króna", new CountryCodeEnum[]{CountryCodeEnum.IS});
        ISK = currencyEnum70;
        CurrencyEnum currencyEnum71 = new CurrencyEnum("JMD", 70, 388, digits, "Jamaican dollar", new CountryCodeEnum[]{CountryCodeEnum.JM});
        JMD = currencyEnum71;
        CurrencyEnum currencyEnum72 = new CurrencyEnum("JOD", 71, 400, digits2, "Jordanian dinar", new CountryCodeEnum[]{CountryCodeEnum.JO});
        JOD = currencyEnum72;
        CurrencyEnum currencyEnum73 = new CurrencyEnum("JPY", 72, 392, digits3, "Japanese yen", new CountryCodeEnum[]{CountryCodeEnum.JP});
        JPY = currencyEnum73;
        CurrencyEnum currencyEnum74 = new CurrencyEnum("KES", 73, WalletConstants.ERROR_CODE_INVALID_PARAMETERS, digits, "Kenyan shilling", new CountryCodeEnum[]{CountryCodeEnum.KE});
        KES = currencyEnum74;
        CurrencyEnum currencyEnum75 = new CurrencyEnum("KGS", 74, 417, digits, "Kyrgyzstani som", new CountryCodeEnum[]{CountryCodeEnum.KG});
        KGS = currencyEnum75;
        CurrencyEnum currencyEnum76 = new CurrencyEnum("KHR", 75, 116, digits, "Cambodian riel", new CountryCodeEnum[]{CountryCodeEnum.KH});
        KHR = currencyEnum76;
        CurrencyEnum currencyEnum77 = new CurrencyEnum("KMF", 76, 174, digits3, "Comoro franc", new CountryCodeEnum[]{CountryCodeEnum.KM});
        KMF = currencyEnum77;
        CurrencyEnum currencyEnum78 = new CurrencyEnum("KPW", 77, 408, digits3, "North Korean won", new CountryCodeEnum[]{CountryCodeEnum.KP});
        KPW = currencyEnum78;
        CurrencyEnum currencyEnum79 = new CurrencyEnum("KRW", 78, WalletConstants.ERROR_CODE_INVALID_TRANSACTION, digits3, "South Korean won", new CountryCodeEnum[]{CountryCodeEnum.KR});
        KRW = currencyEnum79;
        CurrencyEnum currencyEnum80 = new CurrencyEnum("KWD", 79, WalletConstants.ERROR_CODE_ILLEGAL_CALLER, digits2, "Kuwaiti dinar", new CountryCodeEnum[]{CountryCodeEnum.KW});
        KWD = currencyEnum80;
        CurrencyEnum currencyEnum81 = new CurrencyEnum("KYD", 80, 136, digits, "Cayman Islands dollar", new CountryCodeEnum[]{CountryCodeEnum.KY});
        KYD = currencyEnum81;
        CurrencyEnum currencyEnum82 = new CurrencyEnum("KZT", 81, 398, digits, "Kazakhstani tenge", new CountryCodeEnum[]{CountryCodeEnum.KZ});
        KZT = currencyEnum82;
        CurrencyEnum currencyEnum83 = new CurrencyEnum("LAK", 82, 418, digits3, "Lao kip", new CountryCodeEnum[]{CountryCodeEnum.LA});
        LAK = currencyEnum83;
        CurrencyEnum currencyEnum84 = new CurrencyEnum("LBP", 83, 422, digits3, "Lebanese pound", new CountryCodeEnum[]{CountryCodeEnum.LB});
        LBP = currencyEnum84;
        CurrencyEnum currencyEnum85 = new CurrencyEnum("LKR", 84, SyslogConstants.LOG_LOCAL2, digits, "Sri Lankan rupee", new CountryCodeEnum[]{CountryCodeEnum.LK});
        LKR = currencyEnum85;
        CurrencyEnum currencyEnum86 = new CurrencyEnum("LRD", 85, 430, digits, "Liberian dollar", new CountryCodeEnum[]{CountryCodeEnum.LR});
        LRD = currencyEnum86;
        CurrencyEnum currencyEnum87 = new CurrencyEnum("LSL", 86, 426, digits, "Lesotho loti", new CountryCodeEnum[]{CountryCodeEnum.LS});
        LSL = currencyEnum87;
        CurrencyEnum currencyEnum88 = new CurrencyEnum("LTL", 87, 440, digits, "Lithuanian litas", new CountryCodeEnum[]{CountryCodeEnum.LT});
        LTL = currencyEnum88;
        CurrencyEnum currencyEnum89 = new CurrencyEnum("LVL", 88, 428, digits, "Latvian lats", new CountryCodeEnum[]{CountryCodeEnum.LV});
        LVL = currencyEnum89;
        CurrencyEnum currencyEnum90 = new CurrencyEnum("LYD", 89, 434, digits2, "Libyan dinar", new CountryCodeEnum[]{CountryCodeEnum.LY});
        LYD = currencyEnum90;
        CurrencyEnum currencyEnum91 = new CurrencyEnum("MAD", 90, 504, digits, "Moroccan dirham", new CountryCodeEnum[]{CountryCodeEnum.MA});
        MAD = currencyEnum91;
        CurrencyEnum currencyEnum92 = new CurrencyEnum("MDL", 91, 498, digits, "Moldovan leu", new CountryCodeEnum[]{CountryCodeEnum.MD});
        MDL = currencyEnum92;
        Digits digits4 = Digits.DIGITS_07;
        CurrencyEnum currencyEnum93 = new CurrencyEnum("MGA", 92, 969, digits4, "Malagasy ariary", new CountryCodeEnum[]{CountryCodeEnum.MG});
        MGA = currencyEnum93;
        CurrencyEnum currencyEnum94 = new CurrencyEnum("MKD", 93, 807, digits3, "Macedonian denar", new CountryCodeEnum[]{CountryCodeEnum.MK});
        MKD = currencyEnum94;
        CurrencyEnum currencyEnum95 = new CurrencyEnum("MMK", 94, 104, digits3, "Myanma kyat", new CountryCodeEnum[]{CountryCodeEnum.MM});
        MMK = currencyEnum95;
        CurrencyEnum currencyEnum96 = new CurrencyEnum("MNT", 95, 496, digits, "Mongolian tugrik", new CountryCodeEnum[]{CountryCodeEnum.MN});
        MNT = currencyEnum96;
        CurrencyEnum currencyEnum97 = new CurrencyEnum("MOP", 96, OnfidoActivity.RESULT_EXIT_TOKEN_EXPIRED, digits, "Macanese pataca", new CountryCodeEnum[]{countryCodeEnum16});
        MOP = currencyEnum97;
        CurrencyEnum currencyEnum98 = new CurrencyEnum("MRO", 97, 478, digits4, "Mauritanian ouguiya", new CountryCodeEnum[]{CountryCodeEnum.MR});
        MRO = currencyEnum98;
        CurrencyEnum currencyEnum99 = new CurrencyEnum("MUR", 98, DefaultFrameSampler.DESIRED_FRAME_WIDTH, digits, "Mauritian rupee", new CountryCodeEnum[]{CountryCodeEnum.MU});
        MUR = currencyEnum99;
        CurrencyEnum currencyEnum100 = new CurrencyEnum("MVR", 99, 462, digits, "Maldivian rufiyaa", new CountryCodeEnum[]{CountryCodeEnum.MV});
        MVR = currencyEnum100;
        CurrencyEnum currencyEnum101 = new CurrencyEnum("MWK", 100, 454, digits, "Malawian kwacha", new CountryCodeEnum[]{CountryCodeEnum.MW});
        MWK = currencyEnum101;
        CountryCodeEnum countryCodeEnum18 = CountryCodeEnum.MX;
        CurrencyEnum currencyEnum102 = new CurrencyEnum("MXN", 101, 484, digits, "Mexican peso", new CountryCodeEnum[]{countryCodeEnum18});
        MXN = currencyEnum102;
        CurrencyEnum currencyEnum103 = new CurrencyEnum("MXV", 102, 979, digits, "Mexican Unidad de Inversion (UDI) (funds code)", new CountryCodeEnum[]{countryCodeEnum18});
        MXV = currencyEnum103;
        CurrencyEnum currencyEnum104 = new CurrencyEnum("MYR", 103, 458, digits, "Malaysian ringgit", new CountryCodeEnum[]{CountryCodeEnum.MY});
        MYR = currencyEnum104;
        CurrencyEnum currencyEnum105 = new CurrencyEnum("MZN", 104, 943, digits, "Mozambican metical", new CountryCodeEnum[]{CountryCodeEnum.MZ});
        MZN = currencyEnum105;
        CurrencyEnum currencyEnum106 = new CurrencyEnum("NAD", 105, 516, digits, "Namibian dollar", new CountryCodeEnum[]{CountryCodeEnum.NA});
        NAD = currencyEnum106;
        CurrencyEnum currencyEnum107 = new CurrencyEnum("NGN", 106, 566, digits, "Nigerian naira", new CountryCodeEnum[]{CountryCodeEnum.NG});
        NGN = currencyEnum107;
        CurrencyEnum currencyEnum108 = new CurrencyEnum("NIO", 107, 558, digits, "Nicaraguan córdoba", new CountryCodeEnum[]{CountryCodeEnum.NI});
        NIO = currencyEnum108;
        CurrencyEnum currencyEnum109 = new CurrencyEnum("NOK", LDSFile.EF_DG12_TAG, 578, digits, "Norwegian krone", new CountryCodeEnum[]{CountryCodeEnum.NO, CountryCodeEnum.SJ, CountryCodeEnum.BV});
        NOK = currencyEnum109;
        CurrencyEnum currencyEnum110 = new CurrencyEnum("NPR", LDSFile.EF_DG13_TAG, 524, digits, "Nepalese rupee", new CountryCodeEnum[]{CountryCodeEnum.NP});
        NPR = currencyEnum110;
        CurrencyEnum currencyEnum111 = new CurrencyEnum("NZD", LDSFile.EF_DG14_TAG, 554, digits, "New Zealand dollar", new CountryCodeEnum[]{CountryCodeEnum.CK, CountryCodeEnum.NZ, CountryCodeEnum.NU, CountryCodeEnum.PN, CountryCodeEnum.TK});
        NZD = currencyEnum111;
        CurrencyEnum currencyEnum112 = new CurrencyEnum("OMR", LDSFile.EF_DG15_TAG, 512, digits2, "Omani rial", new CountryCodeEnum[]{CountryCodeEnum.OM});
        OMR = currencyEnum112;
        CountryCodeEnum countryCodeEnum19 = CountryCodeEnum.PA;
        CurrencyEnum currencyEnum113 = new CurrencyEnum("PAB", 112, 590, digits, "Panamanian balboa", new CountryCodeEnum[]{countryCodeEnum19});
        PAB = currencyEnum113;
        CurrencyEnum currencyEnum114 = new CurrencyEnum("PEN", 113, 604, digits, "Peruvian nuevo sol", new CountryCodeEnum[]{CountryCodeEnum.PE});
        PEN = currencyEnum114;
        CurrencyEnum currencyEnum115 = new CurrencyEnum("PGK", 114, 598, digits, "Papua New Guinean kina", new CountryCodeEnum[]{CountryCodeEnum.PG});
        PGK = currencyEnum115;
        CurrencyEnum currencyEnum116 = new CurrencyEnum("PHP", ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG, 608, digits, "Philippine peso", new CountryCodeEnum[]{CountryCodeEnum.PH});
        PHP = currencyEnum116;
        CurrencyEnum currencyEnum117 = new CurrencyEnum("PKR", 116, 586, digits, "Pakistani rupee", new CountryCodeEnum[]{CountryCodeEnum.PK});
        PKR = currencyEnum117;
        CurrencyEnum currencyEnum118 = new CurrencyEnum("PLN", LDSFile.EF_DG2_TAG, 985, digits, "Polish złoty", new CountryCodeEnum[]{CountryCodeEnum.PL});
        PLN = currencyEnum118;
        CurrencyEnum currencyEnum119 = new CurrencyEnum("PYG", LDSFile.EF_DG4_TAG, 600, digits3, "Paraguayan guaraní", new CountryCodeEnum[]{CountryCodeEnum.PY});
        PYG = currencyEnum119;
        CurrencyEnum currencyEnum120 = new CurrencyEnum("QAR", LDSFile.EF_SOD_TAG, 634, digits, "Qatari riyal", new CountryCodeEnum[]{CountryCodeEnum.QA});
        QAR = currencyEnum120;
        CurrencyEnum currencyEnum121 = new CurrencyEnum("RON", SyslogConstants.LOG_CLOCK, 946, digits, "Romanian new leu", new CountryCodeEnum[]{CountryCodeEnum.RO});
        RON = currencyEnum121;
        CurrencyEnum currencyEnum122 = new CurrencyEnum("RSD", 121, 941, digits, "Serbian dinar", new CountryCodeEnum[]{CountryCodeEnum.RS});
        RSD = currencyEnum122;
        CurrencyEnum currencyEnum123 = new CurrencyEnum("RUB", 122, 643, digits, "Russian rouble", new CountryCodeEnum[]{CountryCodeEnum.RU});
        RUB = currencyEnum123;
        CurrencyEnum currencyEnum124 = new CurrencyEnum("RWF", 123, 646, digits3, "Rwandan franc", new CountryCodeEnum[]{CountryCodeEnum.RW});
        RWF = currencyEnum124;
        CurrencyEnum currencyEnum125 = new CurrencyEnum("SAR", 124, 682, digits, "Saudi riyal", new CountryCodeEnum[]{CountryCodeEnum.SA});
        SAR = currencyEnum125;
        CurrencyEnum currencyEnum126 = new CurrencyEnum("SBD", ISO781611.SMT_TAG, 90, digits, "Solomon Islands dollar", new CountryCodeEnum[]{CountryCodeEnum.SB});
        SBD = currencyEnum126;
        CurrencyEnum currencyEnum127 = new CurrencyEnum("SCR", 126, 690, digits, "Seychelles rupee", new CountryCodeEnum[]{CountryCodeEnum.SC});
        SCR = currencyEnum127;
        CurrencyEnum currencyEnum128 = new CurrencyEnum("SDG", CertificateBody.profileType, 938, digits, "Sudanese pound", new CountryCodeEnum[]{CountryCodeEnum.SD});
        SDG = currencyEnum128;
        CurrencyEnum currencyEnum129 = new CurrencyEnum("SEK", 128, 752, digits, "Swedish krona/kronor", new CountryCodeEnum[]{CountryCodeEnum.SE});
        SEK = currencyEnum129;
        CurrencyEnum currencyEnum130 = new CurrencyEnum("SGD", 129, 702, digits, "Singapore dollar", new CountryCodeEnum[]{countryCodeEnum4, countryCodeEnum3});
        SGD = currencyEnum130;
        CurrencyEnum currencyEnum131 = new CurrencyEnum("SHP", 130, 654, digits, "Saint Helena pound", new CountryCodeEnum[]{CountryCodeEnum.SH});
        SHP = currencyEnum131;
        CurrencyEnum currencyEnum132 = new CurrencyEnum("SLL", ISO781611.CREATION_DATE_AND_TIME_TAG, 694, digits3, "Sierra Leonean leone", new CountryCodeEnum[]{CountryCodeEnum.SL});
        SLL = currencyEnum132;
        CurrencyEnum currencyEnum133 = new CurrencyEnum("SOS", 132, 706, digits, "Somali shilling", new CountryCodeEnum[]{CountryCodeEnum.SO});
        SOS = currencyEnum133;
        CurrencyEnum currencyEnum134 = new CurrencyEnum("SRD", 133, 968, digits, "Surinamese dollar", new CountryCodeEnum[]{CountryCodeEnum.SR});
        SRD = currencyEnum134;
        CurrencyEnum currencyEnum135 = new CurrencyEnum("SSP", ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA, 728, digits, "South Sudanese pound", new CountryCodeEnum[]{CountryCodeEnum.SS});
        SSP = currencyEnum135;
        CurrencyEnum currencyEnum136 = new CurrencyEnum("STD", 135, 678, digits3, "São Tomé and Príncipe dobra", new CountryCodeEnum[]{CountryCodeEnum.ST});
        STD = currencyEnum136;
        CurrencyEnum currencyEnum137 = new CurrencyEnum("SYP", 136, 760, digits, "Syrian pound", new CountryCodeEnum[]{CountryCodeEnum.SY});
        SYP = currencyEnum137;
        CurrencyEnum currencyEnum138 = new CurrencyEnum("SZL", 137, 748, digits, "Swazi lilangeni", new CountryCodeEnum[]{CountryCodeEnum.SZ});
        SZL = currencyEnum138;
        CurrencyEnum currencyEnum139 = new CurrencyEnum("THB", 138, 764, digits, "Thai baht", new CountryCodeEnum[]{CountryCodeEnum.TH});
        THB = currencyEnum139;
        CurrencyEnum currencyEnum140 = new CurrencyEnum("TJS", 139, 972, digits, "Tajikistani somoni", new CountryCodeEnum[]{CountryCodeEnum.TJ});
        TJS = currencyEnum140;
        CurrencyEnum currencyEnum141 = new CurrencyEnum("TMT", 140, 934, digits, "Turkmenistani manat", new CountryCodeEnum[]{CountryCodeEnum.TM});
        TMT = currencyEnum141;
        CurrencyEnum currencyEnum142 = new CurrencyEnum("TND", ModuleDescriptor.MODULE_VERSION, 788, digits2, "Tunisian dinar", new CountryCodeEnum[]{CountryCodeEnum.TN});
        TND = currencyEnum142;
        CurrencyEnum currencyEnum143 = new CurrencyEnum("TOP", 142, 776, digits, "Tongan paʻanga", new CountryCodeEnum[]{CountryCodeEnum.TO});
        TOP = currencyEnum143;
        CurrencyEnum currencyEnum144 = new CurrencyEnum("TRY", 143, 949, digits, "Turkish lira", new CountryCodeEnum[]{CountryCodeEnum.TR});
        TRY = currencyEnum144;
        CurrencyEnum currencyEnum145 = new CurrencyEnum("TTD", SyslogConstants.LOG_LOCAL2, 780, digits, "Trinidad and Tobago dollar", new CountryCodeEnum[]{CountryCodeEnum.TT});
        TTD = currencyEnum145;
        CurrencyEnum currencyEnum146 = new CurrencyEnum("TWD", 145, 901, digits, "New Taiwan dollar", new CountryCodeEnum[]{CountryCodeEnum.TW});
        TWD = currencyEnum146;
        CurrencyEnum currencyEnum147 = new CurrencyEnum("TZS", 146, 834, digits, "Tanzanian shilling", new CountryCodeEnum[]{CountryCodeEnum.TZ});
        TZS = currencyEnum147;
        CurrencyEnum currencyEnum148 = new CurrencyEnum("UAH", 147, 980, digits, "Ukrainian hryvnia", new CountryCodeEnum[]{CountryCodeEnum.UA});
        UAH = currencyEnum148;
        CurrencyEnum currencyEnum149 = new CurrencyEnum("UGX", 148, 800, digits, "Ugandan shilling", new CountryCodeEnum[]{CountryCodeEnum.UG});
        UGX = currencyEnum149;
        CountryCodeEnum countryCodeEnum20 = CountryCodeEnum.AS;
        CountryCodeEnum countryCodeEnum21 = CountryCodeEnum.VG;
        CountryCodeEnum countryCodeEnum22 = CountryCodeEnum.BQ;
        CountryCodeEnum countryCodeEnum23 = CountryCodeEnum.EC;
        CountryCodeEnum countryCodeEnum24 = CountryCodeEnum.SV;
        CountryCodeEnum countryCodeEnum25 = CountryCodeEnum.GU;
        CountryCodeEnum countryCodeEnum26 = CountryCodeEnum.MH;
        CountryCodeEnum countryCodeEnum27 = CountryCodeEnum.FM;
        CountryCodeEnum countryCodeEnum28 = CountryCodeEnum.MP;
        CountryCodeEnum countryCodeEnum29 = CountryCodeEnum.PW;
        CountryCodeEnum countryCodeEnum30 = CountryCodeEnum.PR;
        CountryCodeEnum countryCodeEnum31 = CountryCodeEnum.TL;
        CountryCodeEnum countryCodeEnum32 = CountryCodeEnum.TC;
        CountryCodeEnum countryCodeEnum33 = CountryCodeEnum.US;
        CurrencyEnum currencyEnum150 = new CurrencyEnum("USD", 149, 840, digits, "United States dollar", new CountryCodeEnum[]{countryCodeEnum20, countryCodeEnum, countryCodeEnum2, countryCodeEnum14, countryCodeEnum21, countryCodeEnum22, countryCodeEnum23, countryCodeEnum24, countryCodeEnum25, countryCodeEnum17, countryCodeEnum26, countryCodeEnum27, countryCodeEnum28, countryCodeEnum29, countryCodeEnum19, countryCodeEnum30, countryCodeEnum31, countryCodeEnum32, countryCodeEnum33, CountryCodeEnum.VI, CountryCodeEnum.ZW});
        USD = currencyEnum150;
        CurrencyEnum currencyEnum151 = new CurrencyEnum("USN", 150, 997, digits, "United States dollar (next day) (funds code)", new CountryCodeEnum[]{countryCodeEnum33});
        USN = currencyEnum151;
        CurrencyEnum currencyEnum152 = new CurrencyEnum("USS", ISO7816.TAG_SM_EXPECTED_LENGTH, 998, digits, "United States dollar (same day) (funds code)", new CountryCodeEnum[]{countryCodeEnum33});
        USS = currencyEnum152;
        CountryCodeEnum countryCodeEnum34 = CountryCodeEnum.UY;
        CurrencyEnum currencyEnum153 = new CurrencyEnum("UYI", SyslogConstants.LOG_LOCAL3, 940, digits3, "Uruguay Peso en Unidades Indexadas (URUIURUI) (funds code)", new CountryCodeEnum[]{countryCodeEnum34});
        UYI = currencyEnum153;
        CurrencyEnum currencyEnum154 = new CurrencyEnum("UYU", 153, 858, digits, "Uruguayan peso", new CountryCodeEnum[]{countryCodeEnum34});
        UYU = currencyEnum154;
        CurrencyEnum currencyEnum155 = new CurrencyEnum("UZS", Constants.EMVTag.TAG_9A_TRANSACTION_DATE, 860, digits, "Uzbekistan som", new CountryCodeEnum[]{CountryCodeEnum.UZ});
        UZS = currencyEnum155;
        CurrencyEnum currencyEnum156 = new CurrencyEnum("VEF", 155, 937, digits, "Venezuelan bolívar fuerte", new CountryCodeEnum[]{CountryCodeEnum.VE});
        VEF = currencyEnum156;
        CurrencyEnum currencyEnum157 = new CurrencyEnum("VND", Constants.EMVTag.TAG_9C_TRANSACTION_TYPE, 704, digits3, "Vietnamese dong", new CountryCodeEnum[]{CountryCodeEnum.VN});
        VND = currencyEnum157;
        CurrencyEnum currencyEnum158 = new CurrencyEnum("VUV", 157, 548, digits3, "Vanuatu vatu", new CountryCodeEnum[]{CountryCodeEnum.VU});
        VUV = currencyEnum158;
        CurrencyEnum currencyEnum159 = new CurrencyEnum("WST", ISO781611.SMT_DO_DS, 882, digits, "Samoan tala", new CountryCodeEnum[]{CountryCodeEnum.WS});
        WST = currencyEnum159;
        CurrencyEnum currencyEnum160 = new CurrencyEnum("XAF", 159, 950, digits3, "CFA franc BEAC", new CountryCodeEnum[]{CountryCodeEnum.CM, CountryCodeEnum.CF, countryCodeEnum6, CountryCodeEnum.TD, CountryCodeEnum.GQ, CountryCodeEnum.GA});
        XAF = currencyEnum160;
        Digits digits5 = Digits.DIGITS_NO;
        CurrencyEnum currencyEnum161 = new CurrencyEnum("XAG", 160, 961, digits5, "Silver (one troy ounce)", new CountryCodeEnum[0]);
        XAG = currencyEnum161;
        CurrencyEnum currencyEnum162 = new CurrencyEnum("XAU", 161, 959, digits5, "Gold (one troy ounce)", new CountryCodeEnum[0]);
        XAU = currencyEnum162;
        CurrencyEnum currencyEnum163 = new CurrencyEnum("XBA", 162, 955, digits5, "European Composite Unit (EURCO) (bond market unit)", new CountryCodeEnum[0]);
        XBA = currencyEnum163;
        CurrencyEnum currencyEnum164 = new CurrencyEnum("XBB", Constants.TAG_ACE_LAYER_VERSION, 956, digits5, "European Monetary Unit (E.M.U.-6) (bond market unit)", new CountryCodeEnum[0]);
        XBB = currencyEnum164;
        CurrencyEnum currencyEnum165 = new CurrencyEnum("XBC", Constants.TAG_GPI_VERSION, 957, digits5, "European Unit of Account 9 (E.U.A.-9) (bond market unit)", new CountryCodeEnum[0]);
        XBC = currencyEnum165;
        CurrencyEnum currencyEnum166 = new CurrencyEnum("XBD", Constants.TAG_EMVL3_VERSION, 958, digits5, "European Unit of Account 17 (E.U.A.-17) (bond market unit)", new CountryCodeEnum[0]);
        XBD = currencyEnum166;
        CurrencyEnum currencyEnum167 = new CurrencyEnum("XCD", Constants.TAG_PAYMENT_APP_CLESS_VERSION, 951, digits, "East Caribbean dollar", new CountryCodeEnum[]{CountryCodeEnum.AI, CountryCodeEnum.AG, CountryCodeEnum.DM, CountryCodeEnum.GD, CountryCodeEnum.MS, CountryCodeEnum.KN, CountryCodeEnum.LC, CountryCodeEnum.VC});
        XCD = currencyEnum167;
        CurrencyEnum currencyEnum168 = new CurrencyEnum("XDR", 167, 960, digits5, "Special drawing rights  International Monetary Fund", new CountryCodeEnum[0]);
        XDR = currencyEnum168;
        CurrencyEnum currencyEnum169 = new CurrencyEnum("XFU", 168, -1, digits5, "UIC franc (special settlement currency)", new CountryCodeEnum[0]);
        XFU = currencyEnum169;
        CurrencyEnum currencyEnum170 = new CurrencyEnum("XOF", 169, 952, digits3, "CFA franc BCEAO", new CountryCodeEnum[]{CountryCodeEnum.BJ, CountryCodeEnum.BF, CountryCodeEnum.CI, CountryCodeEnum.GW, CountryCodeEnum.ML, CountryCodeEnum.NE, CountryCodeEnum.SN, CountryCodeEnum.TG});
        XOF = currencyEnum170;
        CurrencyEnum currencyEnum171 = new CurrencyEnum("XPD", 170, 964, digits5, "Palladium (one troy ounce)", new CountryCodeEnum[0]);
        XPD = currencyEnum171;
        CurrencyEnum currencyEnum172 = new CurrencyEnum("XPF", 171, 953, digits3, "CFP franc", new CountryCodeEnum[]{CountryCodeEnum.PF, CountryCodeEnum.NC, CountryCodeEnum.WF});
        XPF = currencyEnum172;
        CurrencyEnum currencyEnum173 = new CurrencyEnum("XPT", 172, 962, digits5, "Platinum (one troy ounce)", new CountryCodeEnum[0]);
        XPT = currencyEnum173;
        CurrencyEnum currencyEnum174 = new CurrencyEnum("XTS", 173, 963, digits5, "Code reserved for testing purposes", new CountryCodeEnum[0]);
        XTS = currencyEnum174;
        CurrencyEnum currencyEnum175 = new CurrencyEnum("XXX", 174, 0, digits5, "No currency", new CountryCodeEnum[0]);
        XXX = currencyEnum175;
        CurrencyEnum currencyEnum176 = new CurrencyEnum("YER", 175, 886, digits, "Yemeni rial", new CountryCodeEnum[]{CountryCodeEnum.YE});
        YER = currencyEnum176;
        CurrencyEnum currencyEnum177 = new CurrencyEnum("ZAR", SyslogConstants.LOG_LOCAL6, 710, digits, "South African rand", new CountryCodeEnum[]{CountryCodeEnum.ZA});
        ZAR = currencyEnum177;
        CurrencyEnum currencyEnum178 = new CurrencyEnum("ZMK", 177, 894, digits, "Zambian kwacha", new CountryCodeEnum[]{CountryCodeEnum.ZM});
        ZMK = currencyEnum178;
        $VALUES = new CurrencyEnum[]{currencyEnum, currencyEnum2, currencyEnum3, currencyEnum4, currencyEnum5, currencyEnum6, currencyEnum7, currencyEnum8, currencyEnum9, currencyEnum10, currencyEnum11, currencyEnum12, currencyEnum13, currencyEnum14, currencyEnum15, currencyEnum16, currencyEnum17, currencyEnum18, currencyEnum19, currencyEnum20, currencyEnum21, currencyEnum22, currencyEnum23, currencyEnum24, currencyEnum25, currencyEnum26, currencyEnum27, currencyEnum28, currencyEnum29, currencyEnum30, currencyEnum31, currencyEnum32, currencyEnum33, currencyEnum34, currencyEnum35, currencyEnum36, currencyEnum37, currencyEnum38, currencyEnum39, currencyEnum40, currencyEnum41, currencyEnum42, currencyEnum43, currencyEnum44, currencyEnum45, currencyEnum46, currencyEnum47, currencyEnum48, currencyEnum49, currencyEnum50, currencyEnum51, currencyEnum52, currencyEnum53, currencyEnum54, currencyEnum55, currencyEnum56, currencyEnum57, currencyEnum58, currencyEnum59, currencyEnum60, currencyEnum61, currencyEnum62, currencyEnum63, currencyEnum64, currencyEnum65, currencyEnum66, currencyEnum67, currencyEnum68, currencyEnum69, currencyEnum70, currencyEnum71, currencyEnum72, currencyEnum73, currencyEnum74, currencyEnum75, currencyEnum76, currencyEnum77, currencyEnum78, currencyEnum79, currencyEnum80, currencyEnum81, currencyEnum82, currencyEnum83, currencyEnum84, currencyEnum85, currencyEnum86, currencyEnum87, currencyEnum88, currencyEnum89, currencyEnum90, currencyEnum91, currencyEnum92, currencyEnum93, currencyEnum94, currencyEnum95, currencyEnum96, currencyEnum97, currencyEnum98, currencyEnum99, currencyEnum100, currencyEnum101, currencyEnum102, currencyEnum103, currencyEnum104, currencyEnum105, currencyEnum106, currencyEnum107, currencyEnum108, currencyEnum109, currencyEnum110, currencyEnum111, currencyEnum112, currencyEnum113, currencyEnum114, currencyEnum115, currencyEnum116, currencyEnum117, currencyEnum118, currencyEnum119, currencyEnum120, currencyEnum121, currencyEnum122, currencyEnum123, currencyEnum124, currencyEnum125, currencyEnum126, currencyEnum127, currencyEnum128, currencyEnum129, currencyEnum130, currencyEnum131, currencyEnum132, currencyEnum133, currencyEnum134, currencyEnum135, currencyEnum136, currencyEnum137, currencyEnum138, currencyEnum139, currencyEnum140, currencyEnum141, currencyEnum142, currencyEnum143, currencyEnum144, currencyEnum145, currencyEnum146, currencyEnum147, currencyEnum148, currencyEnum149, currencyEnum150, currencyEnum151, currencyEnum152, currencyEnum153, currencyEnum154, currencyEnum155, currencyEnum156, currencyEnum157, currencyEnum158, currencyEnum159, currencyEnum160, currencyEnum161, currencyEnum162, currencyEnum163, currencyEnum164, currencyEnum165, currencyEnum166, currencyEnum167, currencyEnum168, currencyEnum169, currencyEnum170, currencyEnum171, currencyEnum172, currencyEnum173, currencyEnum174, currencyEnum175, currencyEnum176, currencyEnum177, currencyEnum178};
    }

    private CurrencyEnum(String str, int i, int i2, Digits digits, String str2, CountryCodeEnum[] countryCodeEnumArr) {
        this.name = str2;
        this.numeric = i2;
        this.digits = digits;
        this.countries = countryCodeEnumArr;
    }

    public static CurrencyEnum find(String str) {
        for (int i = 0; i < values().length; i++) {
            if (values()[i].getCode().equals(str)) {
                return values()[i];
            }
        }
        return null;
    }

    public static CurrencyEnum valueOf(String str) {
        return (CurrencyEnum) Enum.valueOf(CurrencyEnum.class, str);
    }

    public static CurrencyEnum[] values() {
        return (CurrencyEnum[]) $VALUES.clone();
    }

    public String format(long j2) {
        String strValueOf;
        int i = AnonymousClass1.$SwitchMap$com$github$devnied$emvnfccard$model$enums$CurrencyEnum$Digits[this.digits.ordinal()];
        if (i == 1) {
            strValueOf = String.valueOf(j2);
        } else if (i == 2) {
            String strValueOf2 = String.valueOf(j2 / 100);
            String strValueOf3 = String.valueOf(j2 % 100);
            while (strValueOf3.length() < 2) {
                strValueOf3 = "0".concat(strValueOf3);
            }
            strValueOf = a.o(strValueOf2, ".", strValueOf3);
        } else if (i != 3) {
            strValueOf = (i == 4 || i != 5) ? String.valueOf(j2) : String.valueOf(j2);
        } else {
            String strValueOf4 = String.valueOf(j2 / 1000);
            String strValueOf5 = String.valueOf(j2 % 1000);
            while (strValueOf5.length() < 3) {
                strValueOf5 = "0".concat(strValueOf5);
            }
            strValueOf = a.o(strValueOf4, ".", strValueOf5);
        }
        return getCode() + " " + strValueOf;
    }

    public String getCode() {
        return this.code;
    }

    public CountryCodeEnum[] getCountries() {
        return this.countries;
    }

    public String getISOCodeAlpha() {
        return name();
    }

    public int getISOCodeNumeric() {
        return this.numeric;
    }

    @Override // com.github.devnied.emvnfccard.model.enums.IKeyEnum
    public int getKey() {
        return this.numeric;
    }

    public String getName() {
        return this.name;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.code;
    }

    public static CurrencyEnum find(CountryCodeEnum countryCodeEnum) {
        if (countryCodeEnum == null) {
            return null;
        }
        switch (AnonymousClass1.$SwitchMap$com$github$devnied$emvnfccard$model$enums$CountryCodeEnum[countryCodeEnum.ordinal()]) {
            case 1:
                return BOB;
            case 2:
                return CHF;
            case 3:
                return CLP;
            case 4:
                return MXN;
            case 5:
                return USD;
            case 6:
                return UYU;
            default:
                CurrencyEnum currencyEnum = null;
                for (int i = 0; i < values().length; i++) {
                    for (CountryCodeEnum countryCodeEnum2 : values()[i].getCountries()) {
                        if (countryCodeEnum2 == countryCodeEnum) {
                            if (currencyEnum != null) {
                                return null;
                            }
                            currencyEnum = values()[i];
                        }
                    }
                }
                return currencyEnum;
        }
    }

    public static CurrencyEnum find(CountryCodeEnum countryCodeEnum, CurrencyEnum currencyEnum) {
        CurrencyEnum currencyEnumFind = find(countryCodeEnum);
        return currencyEnumFind == null ? currencyEnum : currencyEnumFind;
    }
}
