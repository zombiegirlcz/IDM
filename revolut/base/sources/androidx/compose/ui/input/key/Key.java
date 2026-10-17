package androidx.compose.ui.input.key;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.PassportService;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/input/key/Key;", "", "", "keyCode", "constructor-impl", "(J)J", "Companion", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Key {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Unknown = Key_androidKt.Key(0);
    private static final long SoftLeft = Key_androidKt.Key(1);
    private static final long SoftRight = Key_androidKt.Key(2);
    private static final long Home = Key_androidKt.Key(3);
    private static final long Back = Key_androidKt.Key(4);
    private static final long Help = Key_androidKt.Key(259);
    private static final long NavigatePrevious = Key_androidKt.Key(260);
    private static final long NavigateNext = Key_androidKt.Key(261);
    private static final long NavigateIn = Key_androidKt.Key(262);
    private static final long NavigateOut = Key_androidKt.Key(263);
    private static final long SystemNavigationUp = Key_androidKt.Key(280);
    private static final long SystemNavigationDown = Key_androidKt.Key(281);
    private static final long SystemNavigationLeft = Key_androidKt.Key(282);
    private static final long SystemNavigationRight = Key_androidKt.Key(283);
    private static final long Call = Key_androidKt.Key(5);
    private static final long EndCall = Key_androidKt.Key(6);
    private static final long DirectionUp = Key_androidKt.Key(19);
    private static final long DirectionDown = Key_androidKt.Key(20);
    private static final long DirectionLeft = Key_androidKt.Key(21);
    private static final long DirectionRight = Key_androidKt.Key(22);
    private static final long DirectionCenter = Key_androidKt.Key(23);
    private static final long DirectionUpLeft = Key_androidKt.Key(268);
    private static final long DirectionDownLeft = Key_androidKt.Key(269);
    private static final long DirectionUpRight = Key_androidKt.Key(270);
    private static final long DirectionDownRight = Key_androidKt.Key(271);
    private static final long VolumeUp = Key_androidKt.Key(24);
    private static final long VolumeDown = Key_androidKt.Key(25);
    private static final long Power = Key_androidKt.Key(26);
    private static final long Camera = Key_androidKt.Key(27);
    private static final long Clear = Key_androidKt.Key(28);
    private static final long Zero = Key_androidKt.Key(7);
    private static final long One = Key_androidKt.Key(8);
    private static final long Two = Key_androidKt.Key(9);
    private static final long Three = Key_androidKt.Key(10);
    private static final long Four = Key_androidKt.Key(11);
    private static final long Five = Key_androidKt.Key(12);
    private static final long Six = Key_androidKt.Key(13);
    private static final long Seven = Key_androidKt.Key(14);
    private static final long Eight = Key_androidKt.Key(15);
    private static final long Nine = Key_androidKt.Key(16);
    private static final long Plus = Key_androidKt.Key(81);
    private static final long Minus = Key_androidKt.Key(69);
    private static final long Multiply = Key_androidKt.Key(17);
    private static final long Equals = Key_androidKt.Key(70);
    private static final long Pound = Key_androidKt.Key(18);
    private static final long A = Key_androidKt.Key(29);
    private static final long B = Key_androidKt.Key(30);
    private static final long C = Key_androidKt.Key(31);
    private static final long D = Key_androidKt.Key(32);
    private static final long E = Key_androidKt.Key(33);
    private static final long F = Key_androidKt.Key(34);
    private static final long G = Key_androidKt.Key(35);
    private static final long H = Key_androidKt.Key(36);
    private static final long I = Key_androidKt.Key(37);
    private static final long J = Key_androidKt.Key(38);
    private static final long K = Key_androidKt.Key(39);
    private static final long L = Key_androidKt.Key(40);
    private static final long M = Key_androidKt.Key(41);
    private static final long N = Key_androidKt.Key(42);
    private static final long O = Key_androidKt.Key(43);
    private static final long P = Key_androidKt.Key(44);
    private static final long Q = Key_androidKt.Key(45);
    private static final long R = Key_androidKt.Key(46);
    private static final long S = Key_androidKt.Key(47);
    private static final long T = Key_androidKt.Key(48);
    private static final long U = Key_androidKt.Key(49);
    private static final long V = Key_androidKt.Key(50);
    private static final long W = Key_androidKt.Key(51);
    private static final long X = Key_androidKt.Key(52);
    private static final long Y = Key_androidKt.Key(53);
    private static final long Z = Key_androidKt.Key(54);
    private static final long Comma = Key_androidKt.Key(55);
    private static final long Period = Key_androidKt.Key(56);
    private static final long AltLeft = Key_androidKt.Key(57);
    private static final long AltRight = Key_androidKt.Key(58);
    private static final long ShiftLeft = Key_androidKt.Key(59);
    private static final long ShiftRight = Key_androidKt.Key(60);
    private static final long Tab = Key_androidKt.Key(61);
    private static final long Spacebar = Key_androidKt.Key(62);
    private static final long Symbol = Key_androidKt.Key(63);
    private static final long Browser = Key_androidKt.Key(64);
    private static final long Envelope = Key_androidKt.Key(65);
    private static final long Enter = Key_androidKt.Key(66);
    private static final long Backspace = Key_androidKt.Key(67);
    private static final long Delete = Key_androidKt.Key(112);
    private static final long Escape = Key_androidKt.Key(LDSFile.EF_DG15_TAG);
    private static final long CtrlLeft = Key_androidKt.Key(113);
    private static final long CtrlRight = Key_androidKt.Key(114);
    private static final long CapsLock = Key_androidKt.Key(ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
    private static final long ScrollLock = Key_androidKt.Key(116);
    private static final long MetaLeft = Key_androidKt.Key(LDSFile.EF_DG2_TAG);
    private static final long MetaRight = Key_androidKt.Key(LDSFile.EF_DG4_TAG);
    private static final long Function = Key_androidKt.Key(LDSFile.EF_SOD_TAG);
    private static final long PrintScreen = Key_androidKt.Key(SyslogConstants.LOG_CLOCK);
    private static final long Break = Key_androidKt.Key(121);
    private static final long MoveHome = Key_androidKt.Key(122);
    private static final long MoveEnd = Key_androidKt.Key(123);
    private static final long Insert = Key_androidKt.Key(124);
    private static final long Cut = Key_androidKt.Key(277);
    private static final long Copy = Key_androidKt.Key(278);
    private static final long Paste = Key_androidKt.Key(279);
    private static final long Grave = Key_androidKt.Key(68);
    private static final long LeftBracket = Key_androidKt.Key(71);
    private static final long RightBracket = Key_androidKt.Key(72);
    private static final long Slash = Key_androidKt.Key(76);
    private static final long Backslash = Key_androidKt.Key(73);
    private static final long Semicolon = Key_androidKt.Key(74);
    private static final long Apostrophe = Key_androidKt.Key(75);
    private static final long At = Key_androidKt.Key(77);
    private static final long Number = Key_androidKt.Key(78);
    private static final long HeadsetHook = Key_androidKt.Key(79);
    private static final long Focus = Key_androidKt.Key(80);
    private static final long Menu = Key_androidKt.Key(82);
    private static final long Notification = Key_androidKt.Key(83);
    private static final long Search = Key_androidKt.Key(84);
    private static final long PageUp = Key_androidKt.Key(92);
    private static final long PageDown = Key_androidKt.Key(93);
    private static final long PictureSymbols = Key_androidKt.Key(94);
    private static final long SwitchCharset = Key_androidKt.Key(95);
    private static final long ButtonA = Key_androidKt.Key(96);
    private static final long ButtonB = Key_androidKt.Key(97);
    private static final long ButtonC = Key_androidKt.Key(98);
    private static final long ButtonX = Key_androidKt.Key(99);
    private static final long ButtonY = Key_androidKt.Key(100);
    private static final long ButtonZ = Key_androidKt.Key(101);
    private static final long ButtonL1 = Key_androidKt.Key(102);
    private static final long ButtonR1 = Key_androidKt.Key(103);
    private static final long ButtonL2 = Key_androidKt.Key(104);
    private static final long ButtonR2 = Key_androidKt.Key(105);
    private static final long ButtonThumbLeft = Key_androidKt.Key(106);
    private static final long ButtonThumbRight = Key_androidKt.Key(107);
    private static final long ButtonStart = Key_androidKt.Key(LDSFile.EF_DG12_TAG);
    private static final long ButtonSelect = Key_androidKt.Key(LDSFile.EF_DG13_TAG);
    private static final long ButtonMode = Key_androidKt.Key(LDSFile.EF_DG14_TAG);
    private static final long Button1 = Key_androidKt.Key(188);
    private static final long Button2 = Key_androidKt.Key(189);
    private static final long Button3 = Key_androidKt.Key(190);
    private static final long Button4 = Key_androidKt.Key(191);
    private static final long Button5 = Key_androidKt.Key(192);
    private static final long Button6 = Key_androidKt.Key(Constants.TAG_ATMEL_SERIAL);
    private static final long Button7 = Key_androidKt.Key(194);
    private static final long Button8 = Key_androidKt.Key(195);
    private static final long Button9 = Key_androidKt.Key(196);
    private static final long Button10 = Key_androidKt.Key(Constants.TAG_BATTERY_STATE);
    private static final long Button11 = Key_androidKt.Key(Constants.TAG_POWER_OFF_TIMEOUT);
    private static final long Button12 = Key_androidKt.Key(199);
    private static final long Button13 = Key_androidKt.Key(200);
    private static final long Button14 = Key_androidKt.Key(201);
    private static final long Button15 = Key_androidKt.Key(202);
    private static final long Button16 = Key_androidKt.Key(Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_1);
    private static final long Forward = Key_androidKt.Key(ISO781611.SMT_TAG);
    private static final long F1 = Key_androidKt.Key(ISO781611.CREATION_DATE_AND_TIME_TAG);
    private static final long F2 = Key_androidKt.Key(132);
    private static final long F3 = Key_androidKt.Key(133);
    private static final long F4 = Key_androidKt.Key(ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA);
    private static final long F5 = Key_androidKt.Key(135);
    private static final long F6 = Key_androidKt.Key(136);
    private static final long F7 = Key_androidKt.Key(137);
    private static final long F8 = Key_androidKt.Key(138);
    private static final long F9 = Key_androidKt.Key(139);
    private static final long F10 = Key_androidKt.Key(140);
    private static final long F11 = Key_androidKt.Key(ModuleDescriptor.MODULE_VERSION);
    private static final long F12 = Key_androidKt.Key(142);
    private static final long NumLock = Key_androidKt.Key(143);
    private static final long NumPad0 = Key_androidKt.Key(SyslogConstants.LOG_LOCAL2);
    private static final long NumPad1 = Key_androidKt.Key(145);
    private static final long NumPad2 = Key_androidKt.Key(146);
    private static final long NumPad3 = Key_androidKt.Key(147);
    private static final long NumPad4 = Key_androidKt.Key(148);
    private static final long NumPad5 = Key_androidKt.Key(149);
    private static final long NumPad6 = Key_androidKt.Key(150);
    private static final long NumPad7 = Key_androidKt.Key(ISO7816.TAG_SM_EXPECTED_LENGTH);
    private static final long NumPad8 = Key_androidKt.Key(SyslogConstants.LOG_LOCAL3);
    private static final long NumPad9 = Key_androidKt.Key(153);
    private static final long NumPadDivide = Key_androidKt.Key(Constants.EMVTag.TAG_9A_TRANSACTION_DATE);
    private static final long NumPadMultiply = Key_androidKt.Key(155);
    private static final long NumPadSubtract = Key_androidKt.Key(Constants.EMVTag.TAG_9C_TRANSACTION_TYPE);
    private static final long NumPadAdd = Key_androidKt.Key(157);
    private static final long NumPadDot = Key_androidKt.Key(ISO781611.SMT_DO_DS);
    private static final long NumPadComma = Key_androidKt.Key(159);
    private static final long NumPadEnter = Key_androidKt.Key(160);
    private static final long NumPadEquals = Key_androidKt.Key(161);
    private static final long NumPadLeftParenthesis = Key_androidKt.Key(162);
    private static final long NumPadRightParenthesis = Key_androidKt.Key(Constants.TAG_ACE_LAYER_VERSION);
    private static final long MediaPlay = Key_androidKt.Key(126);
    private static final long MediaPause = Key_androidKt.Key(CertificateBody.profileType);
    private static final long MediaPlayPause = Key_androidKt.Key(85);
    private static final long MediaStop = Key_androidKt.Key(86);
    private static final long MediaRecord = Key_androidKt.Key(130);
    private static final long MediaNext = Key_androidKt.Key(87);
    private static final long MediaPrevious = Key_androidKt.Key(88);
    private static final long MediaRewind = Key_androidKt.Key(89);
    private static final long MediaFastForward = Key_androidKt.Key(90);
    private static final long MediaClose = Key_androidKt.Key(128);
    private static final long MediaAudioTrack = Key_androidKt.Key(222);
    private static final long MediaEject = Key_androidKt.Key(129);
    private static final long MediaTopMenu = Key_androidKt.Key(Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
    private static final long MediaSkipForward = Key_androidKt.Key(272);
    private static final long MediaSkipBackward = Key_androidKt.Key(273);
    private static final long MediaStepForward = Key_androidKt.Key(274);
    private static final long MediaStepBackward = Key_androidKt.Key(275);
    private static final long MicrophoneMute = Key_androidKt.Key(91);
    private static final long VolumeMute = Key_androidKt.Key(Constants.TAG_GPI_VERSION);
    private static final long Info = Key_androidKt.Key(Constants.TAG_EMVL3_VERSION);
    private static final long ChannelUp = Key_androidKt.Key(Constants.TAG_PAYMENT_APP_CLESS_VERSION);
    private static final long ChannelDown = Key_androidKt.Key(167);
    private static final long ZoomIn = Key_androidKt.Key(168);
    private static final long ZoomOut = Key_androidKt.Key(169);
    private static final long Tv = Key_androidKt.Key(170);
    private static final long Window = Key_androidKt.Key(171);
    private static final long Guide = Key_androidKt.Key(172);
    private static final long Dvr = Key_androidKt.Key(173);
    private static final long Bookmark = Key_androidKt.Key(174);
    private static final long Captions = Key_androidKt.Key(175);
    private static final long Settings = Key_androidKt.Key(SyslogConstants.LOG_LOCAL6);
    private static final long TvPower = Key_androidKt.Key(177);
    private static final long TvInput = Key_androidKt.Key(178);
    private static final long SetTopBoxPower = Key_androidKt.Key(179);
    private static final long SetTopBoxInput = Key_androidKt.Key(180);
    private static final long AvReceiverPower = Key_androidKt.Key(181);
    private static final long AvReceiverInput = Key_androidKt.Key(182);
    private static final long ProgramRed = Key_androidKt.Key(183);
    private static final long ProgramGreen = Key_androidKt.Key(SyslogConstants.LOG_LOCAL7);
    private static final long ProgramYellow = Key_androidKt.Key(185);
    private static final long ProgramBlue = Key_androidKt.Key(186);
    private static final long AppSwitch = Key_androidKt.Key(187);
    private static final long LanguageSwitch = Key_androidKt.Key(Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_2);
    private static final long MannerMode = Key_androidKt.Key(Constants.TAG_KSN_FORMATS);
    private static final long Toggle2D3D = Key_androidKt.Key(206);
    private static final long Contacts = Key_androidKt.Key(Constants.TAG_CF_ENHANCED_SRED_CONFIGURATION);
    private static final long Calendar = Key_androidKt.Key(208);
    private static final long Music = Key_androidKt.Key(Constants.TAG_FIRMWARE_VERSION);
    private static final long Calculator = Key_androidKt.Key(Constants.TAG_SVPP_CHECKSUM);
    private static final long ZenkakuHankaru = Key_androidKt.Key(211);
    private static final long Eisu = Key_androidKt.Key(Constants.TAG_PCI_PED_CHECKSUM);
    private static final long Muhenkan = Key_androidKt.Key(Constants.TAG_EMV_L1_VERSION);
    private static final long Henkan = Key_androidKt.Key(Constants.TAG_EMV_L1_CHECKSUM);
    private static final long KatakanaHiragana = Key_androidKt.Key(Constants.TAG_EMV_L2_VERSION);
    private static final long Yen = Key_androidKt.Key(Constants.TAG_EMV_L2_CHECKSUM);
    private static final long Ro = Key_androidKt.Key(Constants.TAG_BOOT_LOADER_VERSION);
    private static final long Kana = Key_androidKt.Key(Constants.TAG_BOOT_LOADER_CHECKSUM);
    private static final long Assist = Key_androidKt.Key(Constants.TAG_KSL_ID);
    private static final long BrightnessDown = Key_androidKt.Key(220);
    private static final long BrightnessUp = Key_androidKt.Key(221);
    private static final long Sleep = Key_androidKt.Key(PassportService.DEFAULT_MAX_BLOCKSIZE);
    private static final long WakeUp = Key_androidKt.Key(BERTags.FLAGS);
    private static final long SoftSleep = Key_androidKt.Key(276);
    private static final long Pairing = Key_androidKt.Key(Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE);
    private static final long LastChannel = Key_androidKt.Key(Constants.TAG_E5_FUNCTION_LOG_CONFIGURATION);
    private static final long TvDataService = Key_androidKt.Key(230);
    private static final long VoiceAssist = Key_androidKt.Key(Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION);
    private static final long TvRadioService = Key_androidKt.Key(232);
    private static final long TvTeletext = Key_androidKt.Key(Constants.TAG_USB_CAPABILITY);
    private static final long TvNumberEntry = Key_androidKt.Key(Constants.TAG_EMV_ICC_CONFIG_VERSION);
    private static final long TvTerrestrialAnalog = Key_androidKt.Key(Constants.TAG_EMV_NFC_CONFIG_VERSION);
    private static final long TvTerrestrialDigital = Key_androidKt.Key(Constants.TAG_OS_VERSION);
    private static final long TvSatellite = Key_androidKt.Key(Constants.TAG_MPOS_MODULE_STATE);
    private static final long TvSatelliteBs = Key_androidKt.Key(Constants.TAG_EE_SUPPORTED_RPC_ID_LIST);
    private static final long TvSatelliteCs = Key_androidKt.Key(239);
    private static final long TvSatelliteService = Key_androidKt.Key(240);
    private static final long TvNetwork = Key_androidKt.Key(Constants.TAG_TRANSACTION_DATA);
    private static final long TvAntennaCable = Key_androidKt.Key(242);
    private static final long TvInputHdmi1 = Key_androidKt.Key(Constants.TAG_F3_BUILD_CONFIGURATION);
    private static final long TvInputHdmi2 = Key_androidKt.Key(Constants.TAG_F4);
    private static final long TvInputHdmi3 = Key_androidKt.Key(Constants.TAG_F5);
    private static final long TvInputHdmi4 = Key_androidKt.Key(246);
    private static final long TvInputComposite1 = Key_androidKt.Key(Constants.TAG_BLE_FIRMWARE_VERSION);
    private static final long TvInputComposite2 = Key_androidKt.Key(Constants.TAG_FULL_SVPP_IDENTIFICATION);
    private static final long TvInputComponent1 = Key_androidKt.Key(Constants.TAG_RESOURCE_FILE_VERSION);
    private static final long TvInputComponent2 = Key_androidKt.Key(Constants.TAG_SUPPORTED_LOCALE_LIST);
    private static final long TvInputVga1 = Key_androidKt.Key(Constants.TAG_FB_CHARGING_STATUS);
    private static final long TvAudioDescription = Key_androidKt.Key(Constants.TAG_FC_SPEED_MODE);
    private static final long TvAudioDescriptionMixingVolumeUp = Key_androidKt.Key(Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
    private static final long TvAudioDescriptionMixingVolumeDown = Key_androidKt.Key(254);
    private static final long TvZoomMode = Key_androidKt.Key(255);
    private static final long TvContentsMenu = Key_androidKt.Key(256);
    private static final long TvMediaContextMenu = Key_androidKt.Key(StandardBiometricHeader.JTC1_SC37_FORMAT_OWNER_VALUE);
    private static final long TvTimerProgramming = Key_androidKt.Key(258);
    private static final long StemPrimary = Key_androidKt.Key(264);
    private static final long Stem1 = Key_androidKt.Key(265);
    private static final long Stem2 = Key_androidKt.Key(266);
    private static final long Stem3 = Key_androidKt.Key(267);
    private static final long AllApps = Key_androidKt.Key(284);
    private static final long Refresh = Key_androidKt.Key(285);
    private static final long ThumbsUp = Key_androidKt.Key(286);
    private static final long ThumbsDown = Key_androidKt.Key(287);
    private static final long ProfileSwitch = Key_androidKt.Key(288);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bA\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u0017\u0010C\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\b¨\u0006E"}, d2 = {"Landroidx/compose/ui/input/key/Key$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/input/key/Key;", "Back", "J", "getBack-EK5gGoQ", "()J", "NavigatePrevious", "getNavigatePrevious-EK5gGoQ", "NavigateNext", "getNavigateNext-EK5gGoQ", "DirectionUp", "getDirectionUp-EK5gGoQ", "DirectionDown", "getDirectionDown-EK5gGoQ", "DirectionLeft", "getDirectionLeft-EK5gGoQ", "DirectionRight", "getDirectionRight-EK5gGoQ", "DirectionCenter", "getDirectionCenter-EK5gGoQ", "A", "getA-EK5gGoQ", "C", "getC-EK5gGoQ", "H", "getH-EK5gGoQ", "V", "getV-EK5gGoQ", "X", "getX-EK5gGoQ", "Y", "getY-EK5gGoQ", "Z", "getZ-EK5gGoQ", "Tab", "getTab-EK5gGoQ", "Spacebar", "getSpacebar-EK5gGoQ", "Enter", "getEnter-EK5gGoQ", "Backspace", "getBackspace-EK5gGoQ", "Delete", "getDelete-EK5gGoQ", "Escape", "getEscape-EK5gGoQ", "MoveHome", "getMoveHome-EK5gGoQ", "MoveEnd", "getMoveEnd-EK5gGoQ", "Insert", "getInsert-EK5gGoQ", "Cut", "getCut-EK5gGoQ", "Copy", "getCopy-EK5gGoQ", "Paste", "getPaste-EK5gGoQ", "Backslash", "getBackslash-EK5gGoQ", "PageUp", "getPageUp-EK5gGoQ", "PageDown", "getPageDown-EK5gGoQ", "NumPadEnter", "getNumPadEnter-EK5gGoQ", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getA-EK5gGoQ, reason: not valid java name */
        public final long m2353getAEK5gGoQ() {
            return Key.A;
        }

        /* JADX INFO: renamed from: getBack-EK5gGoQ, reason: not valid java name */
        public final long m2354getBackEK5gGoQ() {
            return Key.Back;
        }

        /* JADX INFO: renamed from: getBackslash-EK5gGoQ, reason: not valid java name */
        public final long m2355getBackslashEK5gGoQ() {
            return Key.Backslash;
        }

        /* JADX INFO: renamed from: getBackspace-EK5gGoQ, reason: not valid java name */
        public final long m2356getBackspaceEK5gGoQ() {
            return Key.Backspace;
        }

        /* JADX INFO: renamed from: getC-EK5gGoQ, reason: not valid java name */
        public final long m2357getCEK5gGoQ() {
            return Key.C;
        }

        /* JADX INFO: renamed from: getCopy-EK5gGoQ, reason: not valid java name */
        public final long m2358getCopyEK5gGoQ() {
            return Key.Copy;
        }

        /* JADX INFO: renamed from: getCut-EK5gGoQ, reason: not valid java name */
        public final long m2359getCutEK5gGoQ() {
            return Key.Cut;
        }

        /* JADX INFO: renamed from: getDelete-EK5gGoQ, reason: not valid java name */
        public final long m2360getDeleteEK5gGoQ() {
            return Key.Delete;
        }

        /* JADX INFO: renamed from: getDirectionCenter-EK5gGoQ, reason: not valid java name */
        public final long m2361getDirectionCenterEK5gGoQ() {
            return Key.DirectionCenter;
        }

        /* JADX INFO: renamed from: getDirectionDown-EK5gGoQ, reason: not valid java name */
        public final long m2362getDirectionDownEK5gGoQ() {
            return Key.DirectionDown;
        }

        /* JADX INFO: renamed from: getDirectionLeft-EK5gGoQ, reason: not valid java name */
        public final long m2363getDirectionLeftEK5gGoQ() {
            return Key.DirectionLeft;
        }

        /* JADX INFO: renamed from: getDirectionRight-EK5gGoQ, reason: not valid java name */
        public final long m2364getDirectionRightEK5gGoQ() {
            return Key.DirectionRight;
        }

        /* JADX INFO: renamed from: getDirectionUp-EK5gGoQ, reason: not valid java name */
        public final long m2365getDirectionUpEK5gGoQ() {
            return Key.DirectionUp;
        }

        /* JADX INFO: renamed from: getEnter-EK5gGoQ, reason: not valid java name */
        public final long m2366getEnterEK5gGoQ() {
            return Key.Enter;
        }

        /* JADX INFO: renamed from: getEscape-EK5gGoQ, reason: not valid java name */
        public final long m2367getEscapeEK5gGoQ() {
            return Key.Escape;
        }

        /* JADX INFO: renamed from: getH-EK5gGoQ, reason: not valid java name */
        public final long m2368getHEK5gGoQ() {
            return Key.H;
        }

        /* JADX INFO: renamed from: getInsert-EK5gGoQ, reason: not valid java name */
        public final long m2369getInsertEK5gGoQ() {
            return Key.Insert;
        }

        /* JADX INFO: renamed from: getMoveEnd-EK5gGoQ, reason: not valid java name */
        public final long m2370getMoveEndEK5gGoQ() {
            return Key.MoveEnd;
        }

        /* JADX INFO: renamed from: getMoveHome-EK5gGoQ, reason: not valid java name */
        public final long m2371getMoveHomeEK5gGoQ() {
            return Key.MoveHome;
        }

        /* JADX INFO: renamed from: getNavigateNext-EK5gGoQ, reason: not valid java name */
        public final long m2372getNavigateNextEK5gGoQ() {
            return Key.NavigateNext;
        }

        /* JADX INFO: renamed from: getNavigatePrevious-EK5gGoQ, reason: not valid java name */
        public final long m2373getNavigatePreviousEK5gGoQ() {
            return Key.NavigatePrevious;
        }

        /* JADX INFO: renamed from: getNumPadEnter-EK5gGoQ, reason: not valid java name */
        public final long m2374getNumPadEnterEK5gGoQ() {
            return Key.NumPadEnter;
        }

        /* JADX INFO: renamed from: getPageDown-EK5gGoQ, reason: not valid java name */
        public final long m2375getPageDownEK5gGoQ() {
            return Key.PageDown;
        }

        /* JADX INFO: renamed from: getPageUp-EK5gGoQ, reason: not valid java name */
        public final long m2376getPageUpEK5gGoQ() {
            return Key.PageUp;
        }

        /* JADX INFO: renamed from: getPaste-EK5gGoQ, reason: not valid java name */
        public final long m2377getPasteEK5gGoQ() {
            return Key.Paste;
        }

        /* JADX INFO: renamed from: getSpacebar-EK5gGoQ, reason: not valid java name */
        public final long m2378getSpacebarEK5gGoQ() {
            return Key.Spacebar;
        }

        /* JADX INFO: renamed from: getTab-EK5gGoQ, reason: not valid java name */
        public final long m2379getTabEK5gGoQ() {
            return Key.Tab;
        }

        /* JADX INFO: renamed from: getV-EK5gGoQ, reason: not valid java name */
        public final long m2380getVEK5gGoQ() {
            return Key.V;
        }

        /* JADX INFO: renamed from: getX-EK5gGoQ, reason: not valid java name */
        public final long m2381getXEK5gGoQ() {
            return Key.X;
        }

        /* JADX INFO: renamed from: getY-EK5gGoQ, reason: not valid java name */
        public final long m2382getYEK5gGoQ() {
            return Key.Y;
        }

        /* JADX INFO: renamed from: getZ-EK5gGoQ, reason: not valid java name */
        public final long m2383getZEK5gGoQ() {
            return Key.Z;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m2351constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2352equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }
}
