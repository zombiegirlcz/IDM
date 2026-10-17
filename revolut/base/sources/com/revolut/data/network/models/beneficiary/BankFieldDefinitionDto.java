package com.revolut.data.network.models.beneficiary;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJx\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001c¨\u0006/"}, d2 = {"Lcom/revolut/data/network/models/beneficiary/BankFieldDefinitionDto;", "", "type", "", "regex", "format", "inputMask", "proposedValue", "numeric", "", "choices", "", "Lcom/revolut/data/network/models/beneficiary/BankFieldChoiceDto;", "optional", "editable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getType", "()Ljava/lang/String;", "getRegex", "getFormat", "getInputMask", "getProposedValue", "getNumeric", "()Z", "getChoices", "()Ljava/util/List;", "getOptional", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEditable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/revolut/data/network/models/beneficiary/BankFieldDefinitionDto;", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankFieldDefinitionDto {

    @b("choices")
    private final List<BankFieldChoiceDto> choices;

    @b("editable")
    private final Boolean editable;

    @b("format")
    @NotNull
    private final String format;

    @b("inputMask")
    private final String inputMask;

    @b("numeric")
    private final boolean numeric;

    @b("optional")
    private final Boolean optional;

    @b("proposedValue")
    private final String proposedValue;

    @b("regex")
    @NotNull
    private final String regex;

    @b("type")
    @NotNull
    private final String type;

    public BankFieldDefinitionDto(@NotNull String type, @NotNull String regex, @NotNull String format, String str, String str2, boolean z, List<BankFieldChoiceDto> list, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(format, "format");
        this.type = type;
        this.regex = regex;
        this.format = format;
        this.inputMask = str;
        this.proposedValue = str2;
        this.numeric = z;
        this.choices = list;
        this.optional = bool;
        this.editable = bool2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BankFieldDefinitionDto copy$default(BankFieldDefinitionDto bankFieldDefinitionDto, String str, String str2, String str3, String str4, String str5, boolean z, List list, Boolean bool, Boolean bool2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = bankFieldDefinitionDto.type;
        }
        if ((i & 2) != 0) {
            str2 = bankFieldDefinitionDto.regex;
        }
        if ((i & 4) != 0) {
            str3 = bankFieldDefinitionDto.format;
        }
        if ((i & 8) != 0) {
            str4 = bankFieldDefinitionDto.inputMask;
        }
        if ((i & 16) != 0) {
            str5 = bankFieldDefinitionDto.proposedValue;
        }
        if ((i & 32) != 0) {
            z = bankFieldDefinitionDto.numeric;
        }
        if ((i & 64) != 0) {
            list = bankFieldDefinitionDto.choices;
        }
        if ((i & 128) != 0) {
            bool = bankFieldDefinitionDto.optional;
        }
        if ((i & 256) != 0) {
            bool2 = bankFieldDefinitionDto.editable;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        boolean z3 = z;
        List list2 = list;
        String str6 = str5;
        String str7 = str3;
        return bankFieldDefinitionDto.copy(str, str2, str7, str4, str6, z3, list2, bool3, bool4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRegex() {
        return this.regex;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInputMask() {
        return this.inputMask;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProposedValue() {
        return this.proposedValue;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getNumeric() {
        return this.numeric;
    }

    public final List<BankFieldChoiceDto> component7() {
        return this.choices;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getOptional() {
        return this.optional;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getEditable() {
        return this.editable;
    }

    @NotNull
    public final BankFieldDefinitionDto copy(@NotNull String type, @NotNull String regex, @NotNull String format, String inputMask, String proposedValue, boolean numeric, List<BankFieldChoiceDto> choices, Boolean optional, Boolean editable) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(format, "format");
        return new BankFieldDefinitionDto(type, regex, format, inputMask, proposedValue, numeric, choices, optional, editable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankFieldDefinitionDto)) {
            return false;
        }
        BankFieldDefinitionDto bankFieldDefinitionDto = (BankFieldDefinitionDto) other;
        return Intrinsics.f(this.type, bankFieldDefinitionDto.type) && Intrinsics.f(this.regex, bankFieldDefinitionDto.regex) && Intrinsics.f(this.format, bankFieldDefinitionDto.format) && Intrinsics.f(this.inputMask, bankFieldDefinitionDto.inputMask) && Intrinsics.f(this.proposedValue, bankFieldDefinitionDto.proposedValue) && this.numeric == bankFieldDefinitionDto.numeric && Intrinsics.f(this.choices, bankFieldDefinitionDto.choices) && Intrinsics.f(this.optional, bankFieldDefinitionDto.optional) && Intrinsics.f(this.editable, bankFieldDefinitionDto.editable);
    }

    public final List<BankFieldChoiceDto> getChoices() {
        return this.choices;
    }

    public final Boolean getEditable() {
        return this.editable;
    }

    @NotNull
    public final String getFormat() {
        return this.format;
    }

    public final String getInputMask() {
        return this.inputMask;
    }

    public final boolean getNumeric() {
        return this.numeric;
    }

    public final Boolean getOptional() {
        return this.optional;
    }

    public final String getProposedValue() {
        return this.proposedValue;
    }

    @NotNull
    public final String getRegex() {
        return this.regex;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iC = a.c(a.c(this.type.hashCode() * 31, 31, this.regex), 31, this.format);
        String str = this.inputMask;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.proposedValue;
        int iC2 = j6.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.numeric);
        List<BankFieldChoiceDto> list = this.choices;
        int iHashCode2 = (iC2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.optional;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.editable;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
