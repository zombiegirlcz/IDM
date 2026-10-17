package com.fourthline.orca.core.flavor;

import com.fourthline.sdk.assets.R;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001:\u0002_`BÅ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0019J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0019J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u0019JÎ\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\b@\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u00109\u001a\u0004\bB\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u00109\u001a\u0004\bD\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u00109\u001a\u0004\bF\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u00109\u001a\u0004\bH\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u00109\u001a\u0004\bJ\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u00109\u001a\u0004\bL\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u00109\u001a\u0004\bN\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u00109\u001a\u0004\bP\u0010\u0019R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u00109\u001a\u0004\bR\u0010\u0019R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u00109\u001a\u0004\bT\u0010\u0019R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u00109\u001a\u0004\bV\u0010\u0019R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u00109\u001a\u0004\bX\u0010\u0019R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u00109\u001a\u0004\bZ\u0010\u0019R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b[\u00109\u001a\u0004\b\\\u0010\u0019R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u00109\u001a\u0004\b^\u0010\u0019¨\u0006a"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaFonts;", "", "Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;", "screenHeader", "screenTitle", "screenMessage", "popupHeader", "popupMessage", "popupTitle", "primaryButton", "secondaryButton", "inputField", "inputFieldPlaceholder", "inputFieldTitle", "inputFieldStatus", "scannerInstructionText", "confirmationScreenTitle", "confirmationScreenCheckpoints", "tableElementTitle", "tableElementDescription", "instructionsLink", "hintText", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;)Lcom/fourthline/orca/core/flavor/OrcaFonts;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;", "getScreenHeader", "b", "getScreenTitle", "c", "getScreenMessage", "d", "getPopupHeader", "e", "getPopupMessage", "f", "getPopupTitle", "g", "getPrimaryButton", "h", "getSecondaryButton", "i", "getInputField", "j", "getInputFieldPlaceholder", "k", "getInputFieldTitle", "l", "getInputFieldStatus", "m", "getScannerInstructionText", "n", "getConfirmationScreenTitle", "o", "getConfirmationScreenCheckpoints", "p", "getTableElementTitle", "q", "getTableElementDescription", "r", "getInstructionsLink", "s", "getHintText", "Font", "SystemFont", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrcaFonts {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Font screenHeader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Font screenTitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Font screenMessage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Font popupHeader;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Font popupMessage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Font popupTitle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Font primaryButton;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Font secondaryButton;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Font inputField;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Font inputFieldPlaceholder;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Font inputFieldTitle;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Font inputFieldStatus;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Font scannerInstructionText;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Font confirmationScreenTitle;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final Font confirmationScreenCheckpoints;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Font tableElementTitle;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Font tableElementDescription;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Font instructionsLink;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Font hintText;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;", "", "size", "", "getSize", "()I", "FromFontRes", "FromFile", "Lcom/fourthline/orca/core/flavor/OrcaFonts$Font$FromFile;", "Lcom/fourthline/orca/core/flavor/OrcaFonts$Font$FromFontRes;", "Lcom/fourthline/orca/core/flavor/OrcaFonts$SystemFont;", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Font {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaFonts$Font$FromFile;", "Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;", "Ljava/io/File;", "file", "", "size", "<init>", "(Ljava/io/File;I)V", "component1", "()Ljava/io/File;", "component2", "()I", "copy", "(Ljava/io/File;I)Lcom/fourthline/orca/core/flavor/OrcaFonts$Font$FromFile;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/io/File;", "getFile", "b", "I", "getSize", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FromFile implements Font {
            public static final int $stable = 8;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final File file;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final int size;

            public FromFile(@NotNull File file, int i) {
                Intrinsics.checkNotNullParameter(file, "file");
                this.file = file;
                this.size = i;
            }

            public static /* synthetic */ FromFile copy$default(FromFile fromFile, File file, int i, int i2, Object obj2) {
                if ((i2 & 1) != 0) {
                    file = fromFile.file;
                }
                if ((i2 & 2) != 0) {
                    i = fromFile.size;
                }
                return fromFile.copy(file, i);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final File getFile() {
                return this.file;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getSize() {
                return this.size;
            }

            @NotNull
            public final FromFile copy(@NotNull File file, int size) {
                Intrinsics.checkNotNullParameter(file, "file");
                return new FromFile(file, size);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FromFile)) {
                    return false;
                }
                FromFile fromFile = (FromFile) other;
                return Intrinsics.f(this.file, fromFile.file) && this.size == fromFile.size;
            }

            @NotNull
            public final File getFile() {
                return this.file;
            }

            @Override // com.fourthline.orca.core.flavor.OrcaFonts.Font
            public int getSize() {
                return this.size;
            }

            public int hashCode() {
                return (this.file.hashCode() * 31) + Integer.hashCode(this.size);
            }

            @NotNull
            public String toString() {
                return "FromFile(file=" + this.file + ", size=" + this.size + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaFonts$Font$FromFontRes;", "Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;", "", "fontRes", "size", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/fourthline/orca/core/flavor/OrcaFonts$Font$FromFontRes;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getFontRes", "b", "getSize", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class FromFontRes implements Font {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final int fontRes;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final int size;

            public FromFontRes(int i, int i2) {
                this.fontRes = i;
                this.size = i2;
            }

            public static /* synthetic */ FromFontRes copy$default(FromFontRes fromFontRes, int i, int i2, int i3, Object obj2) {
                if ((i3 & 1) != 0) {
                    i = fromFontRes.fontRes;
                }
                if ((i3 & 2) != 0) {
                    i2 = fromFontRes.size;
                }
                return fromFontRes.copy(i, i2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getFontRes() {
                return this.fontRes;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getSize() {
                return this.size;
            }

            @NotNull
            public final FromFontRes copy(int fontRes, int size) {
                return new FromFontRes(fontRes, size);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FromFontRes)) {
                    return false;
                }
                FromFontRes fromFontRes = (FromFontRes) other;
                return this.fontRes == fromFontRes.fontRes && this.size == fromFontRes.size;
            }

            public final int getFontRes() {
                return this.fontRes;
            }

            @Override // com.fourthline.orca.core.flavor.OrcaFonts.Font
            public int getSize() {
                return this.size;
            }

            public int hashCode() {
                return (Integer.hashCode(this.fontRes) * 31) + Integer.hashCode(this.size);
            }

            @NotNull
            public String toString() {
                return "FromFontRes(fontRes=" + this.fontRes + ", size=" + this.size + ")";
            }
        }

        int getSize();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaFonts$SystemFont;", "Lcom/fourthline/orca/core/flavor/OrcaFonts$Font;", "", "size", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/fourthline/orca/core/flavor/OrcaFonts$SystemFont;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getSize", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SystemFont implements Font {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int size;

        public SystemFont(int i) {
            this.size = i;
        }

        public static /* synthetic */ SystemFont copy$default(SystemFont systemFont, int i, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                i = systemFont.size;
            }
            return systemFont.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        @NotNull
        public final SystemFont copy(int size) {
            return new SystemFont(size);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SystemFont) && this.size == ((SystemFont) other).size;
        }

        @Override // com.fourthline.orca.core.flavor.OrcaFonts.Font
        public int getSize() {
            return this.size;
        }

        public int hashCode() {
            return Integer.hashCode(this.size);
        }

        @NotNull
        public String toString() {
            return "SystemFont(size=" + this.size + ")";
        }
    }

    public OrcaFonts() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public static /* synthetic */ OrcaFonts copy$default(OrcaFonts orcaFonts, Font font, Font font2, Font font3, Font font4, Font font5, Font font6, Font font7, Font font8, Font font9, Font font10, Font font11, Font font12, Font font13, Font font14, Font font15, Font font16, Font font17, Font font18, Font font19, int i, Object obj2) {
        Font font20;
        Font font21;
        Font font22 = (i & 1) != 0 ? orcaFonts.screenHeader : font;
        Font font23 = (i & 2) != 0 ? orcaFonts.screenTitle : font2;
        Font font24 = (i & 4) != 0 ? orcaFonts.screenMessage : font3;
        Font font25 = (i & 8) != 0 ? orcaFonts.popupHeader : font4;
        Font font26 = (i & 16) != 0 ? orcaFonts.popupMessage : font5;
        Font font27 = (i & 32) != 0 ? orcaFonts.popupTitle : font6;
        Font font28 = (i & 64) != 0 ? orcaFonts.primaryButton : font7;
        Font font29 = (i & 128) != 0 ? orcaFonts.secondaryButton : font8;
        Font font30 = (i & 256) != 0 ? orcaFonts.inputField : font9;
        Font font31 = (i & 512) != 0 ? orcaFonts.inputFieldPlaceholder : font10;
        Font font32 = (i & 1024) != 0 ? orcaFonts.inputFieldTitle : font11;
        Font font33 = (i & 2048) != 0 ? orcaFonts.inputFieldStatus : font12;
        Font font34 = (i & 4096) != 0 ? orcaFonts.scannerInstructionText : font13;
        Font font35 = (i & 8192) != 0 ? orcaFonts.confirmationScreenTitle : font14;
        Font font36 = font22;
        Font font37 = (i & 16384) != 0 ? orcaFonts.confirmationScreenCheckpoints : font15;
        Font font38 = (i & 32768) != 0 ? orcaFonts.tableElementTitle : font16;
        Font font39 = (i & 65536) != 0 ? orcaFonts.tableElementDescription : font17;
        Font font40 = (i & 131072) != 0 ? orcaFonts.instructionsLink : font18;
        if ((i & 262144) != 0) {
            font21 = font40;
            font20 = orcaFonts.hintText;
        } else {
            font20 = font19;
            font21 = font40;
        }
        return orcaFonts.copy(font36, font23, font24, font25, font26, font27, font28, font29, font30, font31, font32, font33, font34, font35, font37, font38, font39, font21, font20);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Font getScreenHeader() {
        return this.screenHeader;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Font getInputFieldPlaceholder() {
        return this.inputFieldPlaceholder;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Font getInputFieldTitle() {
        return this.inputFieldTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Font getInputFieldStatus() {
        return this.inputFieldStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Font getScannerInstructionText() {
        return this.scannerInstructionText;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Font getConfirmationScreenTitle() {
        return this.confirmationScreenTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Font getConfirmationScreenCheckpoints() {
        return this.confirmationScreenCheckpoints;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Font getTableElementTitle() {
        return this.tableElementTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Font getTableElementDescription() {
        return this.tableElementDescription;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Font getInstructionsLink() {
        return this.instructionsLink;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Font getHintText() {
        return this.hintText;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Font getScreenTitle() {
        return this.screenTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Font getScreenMessage() {
        return this.screenMessage;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Font getPopupHeader() {
        return this.popupHeader;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Font getPopupMessage() {
        return this.popupMessage;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Font getPopupTitle() {
        return this.popupTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Font getPrimaryButton() {
        return this.primaryButton;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Font getSecondaryButton() {
        return this.secondaryButton;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Font getInputField() {
        return this.inputField;
    }

    @NotNull
    public final OrcaFonts copy(@NotNull Font screenHeader, @NotNull Font screenTitle, @NotNull Font screenMessage, @NotNull Font popupHeader, @NotNull Font popupMessage, @NotNull Font popupTitle, @NotNull Font primaryButton, @NotNull Font secondaryButton, @NotNull Font inputField, @NotNull Font inputFieldPlaceholder, @NotNull Font inputFieldTitle, @NotNull Font inputFieldStatus, @NotNull Font scannerInstructionText, @NotNull Font confirmationScreenTitle, @NotNull Font confirmationScreenCheckpoints, @NotNull Font tableElementTitle, @NotNull Font tableElementDescription, @NotNull Font instructionsLink, @NotNull Font hintText) {
        Intrinsics.checkNotNullParameter(screenHeader, "screenHeader");
        Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
        Intrinsics.checkNotNullParameter(screenMessage, "screenMessage");
        Intrinsics.checkNotNullParameter(popupHeader, "popupHeader");
        Intrinsics.checkNotNullParameter(popupMessage, "popupMessage");
        Intrinsics.checkNotNullParameter(popupTitle, "popupTitle");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        Intrinsics.checkNotNullParameter(inputField, "inputField");
        Intrinsics.checkNotNullParameter(inputFieldPlaceholder, "inputFieldPlaceholder");
        Intrinsics.checkNotNullParameter(inputFieldTitle, "inputFieldTitle");
        Intrinsics.checkNotNullParameter(inputFieldStatus, "inputFieldStatus");
        Intrinsics.checkNotNullParameter(scannerInstructionText, "scannerInstructionText");
        Intrinsics.checkNotNullParameter(confirmationScreenTitle, "confirmationScreenTitle");
        Intrinsics.checkNotNullParameter(confirmationScreenCheckpoints, "confirmationScreenCheckpoints");
        Intrinsics.checkNotNullParameter(tableElementTitle, "tableElementTitle");
        Intrinsics.checkNotNullParameter(tableElementDescription, "tableElementDescription");
        Intrinsics.checkNotNullParameter(instructionsLink, "instructionsLink");
        Intrinsics.checkNotNullParameter(hintText, "hintText");
        return new OrcaFonts(screenHeader, screenTitle, screenMessage, popupHeader, popupMessage, popupTitle, primaryButton, secondaryButton, inputField, inputFieldPlaceholder, inputFieldTitle, inputFieldStatus, scannerInstructionText, confirmationScreenTitle, confirmationScreenCheckpoints, tableElementTitle, tableElementDescription, instructionsLink, hintText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaFonts)) {
            return false;
        }
        OrcaFonts orcaFonts = (OrcaFonts) other;
        return Intrinsics.f(this.screenHeader, orcaFonts.screenHeader) && Intrinsics.f(this.screenTitle, orcaFonts.screenTitle) && Intrinsics.f(this.screenMessage, orcaFonts.screenMessage) && Intrinsics.f(this.popupHeader, orcaFonts.popupHeader) && Intrinsics.f(this.popupMessage, orcaFonts.popupMessage) && Intrinsics.f(this.popupTitle, orcaFonts.popupTitle) && Intrinsics.f(this.primaryButton, orcaFonts.primaryButton) && Intrinsics.f(this.secondaryButton, orcaFonts.secondaryButton) && Intrinsics.f(this.inputField, orcaFonts.inputField) && Intrinsics.f(this.inputFieldPlaceholder, orcaFonts.inputFieldPlaceholder) && Intrinsics.f(this.inputFieldTitle, orcaFonts.inputFieldTitle) && Intrinsics.f(this.inputFieldStatus, orcaFonts.inputFieldStatus) && Intrinsics.f(this.scannerInstructionText, orcaFonts.scannerInstructionText) && Intrinsics.f(this.confirmationScreenTitle, orcaFonts.confirmationScreenTitle) && Intrinsics.f(this.confirmationScreenCheckpoints, orcaFonts.confirmationScreenCheckpoints) && Intrinsics.f(this.tableElementTitle, orcaFonts.tableElementTitle) && Intrinsics.f(this.tableElementDescription, orcaFonts.tableElementDescription) && Intrinsics.f(this.instructionsLink, orcaFonts.instructionsLink) && Intrinsics.f(this.hintText, orcaFonts.hintText);
    }

    @NotNull
    public final Font getConfirmationScreenCheckpoints() {
        return this.confirmationScreenCheckpoints;
    }

    @NotNull
    public final Font getConfirmationScreenTitle() {
        return this.confirmationScreenTitle;
    }

    @NotNull
    public final Font getHintText() {
        return this.hintText;
    }

    @NotNull
    public final Font getInputField() {
        return this.inputField;
    }

    @NotNull
    public final Font getInputFieldPlaceholder() {
        return this.inputFieldPlaceholder;
    }

    @NotNull
    public final Font getInputFieldStatus() {
        return this.inputFieldStatus;
    }

    @NotNull
    public final Font getInputFieldTitle() {
        return this.inputFieldTitle;
    }

    @NotNull
    public final Font getInstructionsLink() {
        return this.instructionsLink;
    }

    @NotNull
    public final Font getPopupHeader() {
        return this.popupHeader;
    }

    @NotNull
    public final Font getPopupMessage() {
        return this.popupMessage;
    }

    @NotNull
    public final Font getPopupTitle() {
        return this.popupTitle;
    }

    @NotNull
    public final Font getPrimaryButton() {
        return this.primaryButton;
    }

    @NotNull
    public final Font getScannerInstructionText() {
        return this.scannerInstructionText;
    }

    @NotNull
    public final Font getScreenHeader() {
        return this.screenHeader;
    }

    @NotNull
    public final Font getScreenMessage() {
        return this.screenMessage;
    }

    @NotNull
    public final Font getScreenTitle() {
        return this.screenTitle;
    }

    @NotNull
    public final Font getSecondaryButton() {
        return this.secondaryButton;
    }

    @NotNull
    public final Font getTableElementDescription() {
        return this.tableElementDescription;
    }

    @NotNull
    public final Font getTableElementTitle() {
        return this.tableElementTitle;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.screenHeader.hashCode() * 31) + this.screenTitle.hashCode()) * 31) + this.screenMessage.hashCode()) * 31) + this.popupHeader.hashCode()) * 31) + this.popupMessage.hashCode()) * 31) + this.popupTitle.hashCode()) * 31) + this.primaryButton.hashCode()) * 31) + this.secondaryButton.hashCode()) * 31) + this.inputField.hashCode()) * 31) + this.inputFieldPlaceholder.hashCode()) * 31) + this.inputFieldTitle.hashCode()) * 31) + this.inputFieldStatus.hashCode()) * 31) + this.scannerInstructionText.hashCode()) * 31) + this.confirmationScreenTitle.hashCode()) * 31) + this.confirmationScreenCheckpoints.hashCode()) * 31) + this.tableElementTitle.hashCode()) * 31) + this.tableElementDescription.hashCode()) * 31) + this.instructionsLink.hashCode()) * 31) + this.hintText.hashCode();
    }

    @NotNull
    public String toString() {
        return "OrcaFonts(screenHeader=" + this.screenHeader + ", screenTitle=" + this.screenTitle + ", screenMessage=" + this.screenMessage + ", popupHeader=" + this.popupHeader + ", popupMessage=" + this.popupMessage + ", popupTitle=" + this.popupTitle + ", primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ", inputField=" + this.inputField + ", inputFieldPlaceholder=" + this.inputFieldPlaceholder + ", inputFieldTitle=" + this.inputFieldTitle + ", inputFieldStatus=" + this.inputFieldStatus + ", scannerInstructionText=" + this.scannerInstructionText + ", confirmationScreenTitle=" + this.confirmationScreenTitle + ", confirmationScreenCheckpoints=" + this.confirmationScreenCheckpoints + ", tableElementTitle=" + this.tableElementTitle + ", tableElementDescription=" + this.tableElementDescription + ", instructionsLink=" + this.instructionsLink + ", hintText=" + this.hintText + ")";
    }

    public OrcaFonts(@NotNull Font screenHeader, @NotNull Font screenTitle, @NotNull Font screenMessage, @NotNull Font popupHeader, @NotNull Font popupMessage, @NotNull Font popupTitle, @NotNull Font primaryButton, @NotNull Font secondaryButton, @NotNull Font inputField, @NotNull Font inputFieldPlaceholder, @NotNull Font inputFieldTitle, @NotNull Font inputFieldStatus, @NotNull Font scannerInstructionText, @NotNull Font confirmationScreenTitle, @NotNull Font confirmationScreenCheckpoints, @NotNull Font tableElementTitle, @NotNull Font tableElementDescription, @NotNull Font instructionsLink, @NotNull Font hintText) {
        Intrinsics.checkNotNullParameter(screenHeader, "screenHeader");
        Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
        Intrinsics.checkNotNullParameter(screenMessage, "screenMessage");
        Intrinsics.checkNotNullParameter(popupHeader, "popupHeader");
        Intrinsics.checkNotNullParameter(popupMessage, "popupMessage");
        Intrinsics.checkNotNullParameter(popupTitle, "popupTitle");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
        Intrinsics.checkNotNullParameter(inputField, "inputField");
        Intrinsics.checkNotNullParameter(inputFieldPlaceholder, "inputFieldPlaceholder");
        Intrinsics.checkNotNullParameter(inputFieldTitle, "inputFieldTitle");
        Intrinsics.checkNotNullParameter(inputFieldStatus, "inputFieldStatus");
        Intrinsics.checkNotNullParameter(scannerInstructionText, "scannerInstructionText");
        Intrinsics.checkNotNullParameter(confirmationScreenTitle, "confirmationScreenTitle");
        Intrinsics.checkNotNullParameter(confirmationScreenCheckpoints, "confirmationScreenCheckpoints");
        Intrinsics.checkNotNullParameter(tableElementTitle, "tableElementTitle");
        Intrinsics.checkNotNullParameter(tableElementDescription, "tableElementDescription");
        Intrinsics.checkNotNullParameter(instructionsLink, "instructionsLink");
        Intrinsics.checkNotNullParameter(hintText, "hintText");
        this.screenHeader = screenHeader;
        this.screenTitle = screenTitle;
        this.screenMessage = screenMessage;
        this.popupHeader = popupHeader;
        this.popupMessage = popupMessage;
        this.popupTitle = popupTitle;
        this.primaryButton = primaryButton;
        this.secondaryButton = secondaryButton;
        this.inputField = inputField;
        this.inputFieldPlaceholder = inputFieldPlaceholder;
        this.inputFieldTitle = inputFieldTitle;
        this.inputFieldStatus = inputFieldStatus;
        this.scannerInstructionText = scannerInstructionText;
        this.confirmationScreenTitle = confirmationScreenTitle;
        this.confirmationScreenCheckpoints = confirmationScreenCheckpoints;
        this.tableElementTitle = tableElementTitle;
        this.tableElementDescription = tableElementDescription;
        this.instructionsLink = instructionsLink;
        this.hintText = hintText;
    }

    public /* synthetic */ OrcaFonts(Font font, Font font2, Font font3, Font font4, Font font5, Font font6, Font font7, Font font8, Font font9, Font font10, Font font11, Font font12, Font font13, Font font14, Font font15, Font font16, Font font17, Font font18, Font font19, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Font font20;
        Font fromFontRes;
        Font font21;
        Font fromFontRes2;
        Font font22;
        int i2;
        Font fromFontRes3;
        Font font23;
        Font fromFontRes4;
        Font fromFontRes5;
        Font font24;
        Font fromFontRes6 = (i & 1) != 0 ? new Font.FromFontRes(R.font.roboto_medium, 24) : font;
        Font fromFontRes7 = (i & 2) != 0 ? new Font.FromFontRes(R.font.roboto_medium, 18) : font2;
        Font fromFontRes8 = (i & 4) != 0 ? new Font.FromFontRes(R.font.roboto_regular, 16) : font3;
        Font fromFontRes9 = (i & 8) != 0 ? new Font.FromFontRes(R.font.roboto_medium, 24) : font4;
        Font fromFontRes10 = (i & 16) != 0 ? new Font.FromFontRes(R.font.roboto_regular, 16) : font5;
        Font fromFontRes11 = (i & 32) != 0 ? new Font.FromFontRes(R.font.roboto_medium, 18) : font6;
        Font fromFontRes12 = (i & 64) != 0 ? new Font.FromFontRes(R.font.roboto_medium, 18) : font7;
        Font fromFontRes13 = (i & 128) != 0 ? new Font.FromFontRes(R.font.roboto_medium, 18) : font8;
        Font fromFontRes14 = (i & 256) != 0 ? new Font.FromFontRes(R.font.roboto_medium, 18) : font9;
        Font fromFontRes15 = (i & 512) != 0 ? new Font.FromFontRes(R.font.roboto_regular, 18) : font10;
        Font fromFontRes16 = (i & 1024) != 0 ? new Font.FromFontRes(R.font.roboto_medium, 14) : font11;
        Font fromFontRes17 = (i & 2048) != 0 ? new Font.FromFontRes(R.font.roboto_medium, 12) : font12;
        Font fromFontRes18 = (i & 4096) != 0 ? new Font.FromFontRes(R.font.roboto_medium, 18) : font13;
        if ((i & 8192) != 0) {
            font20 = fromFontRes6;
            fromFontRes = new Font.FromFontRes(R.font.roboto_medium, 20);
        } else {
            font20 = fromFontRes6;
            fromFontRes = font14;
        }
        Font fromFontRes19 = (i & 16384) != 0 ? new Font.FromFontRes(R.font.roboto_regular, 16) : font15;
        if ((i & 32768) != 0) {
            font21 = fromFontRes19;
            fromFontRes2 = new Font.FromFontRes(R.font.roboto_medium, 18);
        } else {
            font21 = fromFontRes19;
            fromFontRes2 = font16;
        }
        if ((i & 65536) != 0) {
            font22 = fromFontRes2;
            i2 = 14;
            fromFontRes3 = new Font.FromFontRes(R.font.roboto_regular, 14);
        } else {
            font22 = fromFontRes2;
            i2 = 14;
            fromFontRes3 = font17;
        }
        if ((i & 131072) != 0) {
            font23 = fromFontRes3;
            fromFontRes4 = new Font.FromFontRes(R.font.roboto_medium, i2);
        } else {
            font23 = fromFontRes3;
            fromFontRes4 = font18;
        }
        if ((i & 262144) != 0) {
            font24 = fromFontRes10;
            fromFontRes5 = new Font.FromFontRes(R.font.roboto_regular, i2);
        } else {
            fromFontRes5 = font19;
            font24 = fromFontRes10;
        }
        this(font20, fromFontRes7, fromFontRes8, fromFontRes9, font24, fromFontRes11, fromFontRes12, fromFontRes13, fromFontRes14, fromFontRes15, fromFontRes16, fromFontRes17, fromFontRes18, fromFontRes, font21, font22, font23, fromFontRes4, fromFontRes5);
    }
}
